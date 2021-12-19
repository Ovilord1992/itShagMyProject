const classAddChild = document.querySelector(".block-color")

let colornameinput = document.querySelector("#colorname")
let selectinput = document.querySelector("#select")
let colorinput = document.querySelector("#color")
let button = document.querySelector("#button")
let errColor = document.querySelector("#c-v")
let errName = document.querySelector("#n-v")


//ищем по элементам списка существует ли имя
const checkitem = () => {
    let filter = colornameinput.value.toUpperCase()
    let el = document.querySelectorAll(".nameitem")
    let t = true;
    if (filter !== "") {
        el.forEach(element => {
            if (element.innerHTML.toUpperCase() == filter) {
                t = false
            }
        })
    } else {
        t = false
    }
    // делал через промис, т.к. легче отследить результат
    return new Promise((res, rej) => {
        if (t) {
            res(t)
        } else {
            rej(t)
        }
    })
}

//проверяем соответствует ли цвет параметрам
const checkercolor = (num, type) => {
    if (type == "rgb" || type == "rgba") {
        return new Promise((res, rej) => {
            let arr = num.replace(/,/g, "").split(" ")
            let t = true
            console.log(arr)
            for (let i = 0; i < arr.length; i++) {
                if ((type == "rgb" && arr.length > 3) || (type == "rgba" && arr.length < 4)) {
                    t = false
                }
                if (arr[i].replace(/\D/g, "").length < arr[i].length) {
                    t = false
                }
                if (arr[i] > 255 || arr[i] < 0) {
                    t = false
                }
                (t) ? res(t) : rej(t)
            }
        })
    }
    if (type == "hex") {
        return new Promise((res, rej) => {
            (num.length >= 4 && num.length <= 7 && num.substr(0, 1) == "#") ? res(true) : rej(false)
        })
    }
}

//добавляем блок на экран
const appenditem = (name, type, color, namecolor) => {
    let itembloc = '<div class="item m-3 d-flex justify-content-center align-items-center" style= "background-color:' + color + '">\n' +
                        '<div class="text-container text-center">\n' +
                            '<h3 class="nameitem m-3">' + name + '</h3>\n' +
                            '<h5 class="m-2">' + type + '</h4>\n' +
                            '<h3 class="m-2">' + namecolor + '</h3>\n' +
                        '</div>\n' +
                     '</div>'
    classAddChild.innerHTML += itembloc;
}

//форматируем цвет
const colorinit = (type, color) => {
    if (type == "rgb") {
        return 'rgb(' + color + ')'
    }
    if (type == "rgba") {
        return 'rgba(' + color + ')'
    } else {
        return color;
    }
}

const errt = (errtype) => {
    errtype.classList.remove("visually-hidden")
    window.setTimeout(
        () => {
            errtype.classList.add("visually-hidden")
        }
        , 3000);
}

//проверяем кучи, если они есть, то парсим элементы и выводим на экран
//т.к. в куки записываются только валидные данные, доп проверка не требуется
const checkercook = () => {
    if (document.cookie != '') {
        let cook = document.cookie.split(";")
        cook.forEach(el => {
            let a = JSON.parse(el.split('=')[1])
            appenditem(a.name, a.type, a.value, a.miniv)
        })
    }

}
checkercook()


//кнопка добавить
// по хорошему надо создание cookie вынести из кнопки в отдельную функцию, но уже лень.
button.addEventListener('click', () => {
    //проверяем на наличие элемента на холсте
    checkitem().then(
        data => {
            //если имя отсутствует то проверяем цвета
            checkercolor(colorinput.value, selectinput.value).then(
                datas => {
                    // если все валидно добавляем на холст
                    appenditem(colornameinput.value, selectinput.value, colorinit(selectinput.value, colorinput.value), colorinput.value)
                    
                    //задаем промежуток жизни для cookie
                    let date = new Date(Date.now() + 1.08e+7);
                    date = date.toUTCString();

                    let nameColor = colornameinput.value
                    let typeColor = selectinput.value
                    let valueColor = colorinit(selectinput.value, colorinput.value)
                    let valueMiniColor = colorinput.value

                    let arrColor = {
                        "name": nameColor,
                        "type": typeColor,
                        "value": valueColor,
                        "miniv": valueMiniColor
                    }
                    //кэшируем куки имя - имя цвета, значение - json с параметрами эллемента
                    document.cookie = ''+ nameColor +'='+ JSON.stringify(arrColor) +'; expires=' + date;
                }
                //ошибка невалидности цвета с выбраным типом
            ).catch(
                err => {
                    errt(errColor)
                })
        }
        //ошибка невалидности имени
    ).catch(
        err => {
            errt(errName)
        }
    )
})

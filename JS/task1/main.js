//api получения курса для задания 6
const uri = 'http://api.currencylayer.com/live?access_key=7613a24051f9f73bc746bbcefb9c232f'

const fun1 = (name = prompt(name = 'is you\'r name ?')) => {
    alert(`you\'r name is ${name}`)
}

const fun2 = (date = prompt(name = 'you date bersday \'year\'')) => {
    const date_now = "2021";
    alert('you year: ' + (date_now - date))
}

const fun3 = (dlinna = parseInt(prompt(name = 'bord'))) => {
    alert(dlinna + dlinna)
}

const fun4 = (rad = parseInt(prompt(name = 'rad cercl'))) => {
    alert(3.14 * (rad * 2))
}

const fun5 = (km = parseFloat(prompt(name = 'km')), hour = parseInt(prompt(name = 'hours'))) => {
    console.log(km / hour)
}

//////////////////////// тут мне уже стало скучно //////////////////////// 
const fun6 = (method, uri) => {
    return new Promise((reselve, reject) => {
        const xhr = new XMLHttpRequest()
        xhr.open(method, uri)
        xhr.responseType = 'json'

        xhr.onload = () => {
            if (xhr.status >= 400) {
                reject(xhr.response)
            } else {
                reselve(xhr.response)
            }
        }
        xhr.onerror = () => {
            reject(xhr.response)
        }
        xhr.send()
    })
}

// парсим пришедший промис и высчитываем сумму.. просто расскоментить вызов

// fun6('GET', uri, USD = parseInt(prompt(name='доллары.. будут переведены в евро')))
//     .then(function(data){
//         let USDEUR = data.quotes.USDEUR
//         let time = new Date(parseInt((data.timestamp + '000')))
//         console.log(Math.round((USD * USDEUR)) + ` евро в ${USD}$ по состоянию на ${time}`)
//     })
//     .catch(err => console.log(err))

const fun7 = (files = parseInt(prompt(name = 'количество гигабайт'))) => {
    console.log(Math.floor((files * 1024) / 820))
}

const fun8 = (
        money = parseFloat(prompt(name = 'количество денег в кошельке')),
        chock = parseFloat(prompt(name = 'цена шоколадки'))
    ) => {
    console.log(Math.floor(money / chock))
}

const fun9 = (num = parseInt(prompt(name = '3 значное число которое перевернется'))) => {
    let result = 0;
    while (num) {
        result = result * 10 + num % 10;
        num = Math.floor(num / 10);
    }
    console.log(result)
}

//зачем тут логические операторы, не совсем понятно, имея всего 2 варианта :)
const fun10 = (num = parseInt(prompt(name = 'введите цифру для проверки на четность'))) => {
    console.log((num % 2 == 0) ? 'chet' : 'ne chet')
}

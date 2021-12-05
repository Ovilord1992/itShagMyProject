let a = document.querySelectorAll(".cercle")
let b = document.querySelector(".button")
let num = 0
b.addEventListener('click', () => {
    if(num > 2) num = 0
    a[num].style.backgroundColor = "yellow"
    for(let i = 0; i < a.length; i++){
        if(i != num){
            a[i].style.backgroundColor = "rgb(153, 151, 149)"
        }
    }
    num++
})




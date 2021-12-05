let boll = document.querySelector("img");
let bod = document.querySelector("body")
bod.style.width = document.documentElement.clientWidth + 'px'
bod.style.height = document.documentElement.clientHeight + 'px'

bod.addEventListener('click', () => {
    let x = event.clientX;
    let y = event.clientY;
    boll.style.position = "absolute";
    boll.style.left = `${x - 50}px`;
    boll.style.top = `${y - 50}px`;

    let domRect = boll.getBoundingClientRect();
    console.log(domRect)
    console.log(window.innerWidth - domRect.top)

    //расчитываем вектор скорости относительно расстояния удара
    let speed = 1000000
    setInterval(() => {
        speed * 10
    }, 100);

    //определяем площать поля
    boll.style.transitionDuration = `${
        (document.documentElement.clientWidth 
            * document.documentElement.clientHeight) / speed
        }s`

})

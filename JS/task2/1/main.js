let inp = document.querySelector("input")

inp.addEventListener('input', (e) => {
    if (parseInt(e.target.value.slice(-1)) / 0
        || parseInt(e.target.value.slice(-1)) == 0) {
        e.target.value = e.target.value.slice(0, -1)
    }
});

let li = document.querySelectorAll("li")

let selectedTd;

document.addEventListener("click", e => {
  let target  = e.target
  highlight(target);
})

function highlight(td) {
  if (selectedTd) { 
    selectedTd.classList.remove('highlight');
  }
  selectedTd = td;
  selectedTd.classList.add('highlight');
}


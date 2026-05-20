function senhaForte(s) {
return s.length > 8 && s !== "12345678";
}
function executar() {
document.getElementById("resultado").innerText = senhaForte(document.getElementById("senha").value);
}
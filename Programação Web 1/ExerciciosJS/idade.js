function podeDirigir(idade) {
    if (idade >= 18) return "Pode ser habilitado(a)";
    return "Ainda não pode ser abilitado";
}
function verificar() {
    const idade = Number(document.getElementById("idade").value);
    document.getElementById("resultado").innerText = podeDirigir(idade);
}
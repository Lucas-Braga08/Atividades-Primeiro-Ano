function calcularIdade() {
    var anoAtual = 2025;
    var anoNascimento = document.getElementById('anoNascimento').value;

    if (anoNascimento === "") {
        document.getElementById('resultado').innerText = "Digite um ano válido!";
        return;
    }

    var idade = anoAtual - anoNascimento;
    document.getElementById('resultado').innerText = "Sua idade é: " + idade + " anos";
}

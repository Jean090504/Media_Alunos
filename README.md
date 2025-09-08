# Projeto Média Ponderada
## Desafio *25/08/2025*

Desafio sobre cálculo de média ponderada.

### O que é Média Ponderada?

A média ponderada é uma média aritmética na qual alguns dos elementos do conjunto de dados têm um "peso" maior ou uma maior importância do que outros. Cada valor é multiplicado por seu peso e a soma desses produtos é dividida pela soma dos pesos.

A fórmula é:

Média Ponderada = (valor1 * peso1 + valor2 * peso2 + ... + valorN * pesoN) / (peso1 + peso2 + ... + pesoN)


# Exemplo de uso:
valores = [7.5, 8.0, 6.5, 9.0]
pesos = [2, 3, 1, 4]

resultado = media_ponderada(valores, pesos)
print(f"A média ponderada é: {resultado:.2f}")
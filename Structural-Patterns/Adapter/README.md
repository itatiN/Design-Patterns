# Adapter

O Adapter é um padrão estrutural que permite que duas classes com interfaces incompatíveis trabalhem juntas.

Ele funciona como um adaptador, convertendo a interface de uma classe para outra que o cliente espera utilizar. Isso é útil quando você precisa integrar bibliotecas, APIs ou sistemas legados sem modificar o código original.

Em vez de alterar uma classe existente, o Adapter cria uma camada intermediária responsável por traduzir chamadas, dados ou comportamentos entre as duas partes.

Quando usar
- Integrar bibliotecas de terceiros.
- Trabalhar com sistemas legados.
- Reutilizar uma classe cuja interface não é compatível com a aplicação.
- Evitar modificar código já existente.

Vantagens
- Reduz o acoplamento entre componentes.
- Permite reutilizar código existente.
- Facilita a integração entre sistemas diferentes.
- Segue o princípio Open/Closed, permitindo adicionar adaptações sem alterar o código original.

Sobre o projeto:
Vou fazer um adaptador de tomadas para diferentes paises. 
Uma aplicação dessas mostra exatamente o quanto o padrão adapter é util.
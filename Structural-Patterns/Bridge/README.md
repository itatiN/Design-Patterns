# Bridge

O padrão Bridge é um padrão de projeto estrutural que tem como intenção separar abstrações (código de alto nível) de implementações (código de baixo nível).

Normalmente, ele é usado no momento do design da arquitetura.

Tem o código extremamente similar ao do padrão Adapter.

## Quando usar

- Quando prevê que novas abstrações ou implementações serão adicionadas com frequência.
- Quando existem duas dimensões que podem variar de forma independente.
- Quando deseja permitir que as abstrações e implementações evoluam sem afetar uma a outra.

## Vantagens

- Evita a criação de um grande número de subclasses.
- Reduz o acoplamento entre abstração e implementação.
- Facilita a extensão do sistema, seguindo o princípio Open/Closed.
- Favorece a reutilização de código por meio da composição em vez da herança.

## Sobre o projeto

Esse é um dos casos em que não vejo sentido em fazer outro projeto, já que a maneira como o código funciona é muito similar a do Adapter. O que muda entre eles é apenas a intenção por trás.

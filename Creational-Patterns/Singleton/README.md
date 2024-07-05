## Singleton
[English Version](#english)

[Portuguese Version](#portuguese) 

## English
The Singleton pattern is one of the simplest and most widely used design patterns, providing a clear solution to guarantee the existence of a single instance of a class with controlled access.

Singleton's main features:
*  **Single instance**: The class manages a single instance of itself.
*  **Global access**: Provides a global method to access this single instance.
*  **Instance control**: Instance creation is controlled to ensure that only one instance is created.

Advantages:
*  **Access control**: Ensures control over how and when the instance is created.
*  **Consistency**: Maintains consistency by ensuring that only one instance exists.
*  **Ease of access**: Provides a global access point to the instance.

Disadvantages:
*  **Difficulty in testing**: Can be difficult to test due to global dependency.
*  **Concurrency problems**: Needs proper handling to avoid problems in multithreaded environments.

When to use:
* When a single instance of a class is needed to control resources, such as database connections or configuration managers.
* When it is necessary to ensure that a single instance of a class is globally accessible.

About the project:
I'm going to make a theme manager that allows you to change themes dynamically.
Such an application made with Singleton ensures that all parts of the application use the same theme and apply changes consistently.

![Singleton](/assets/singleton.png)

## Portuguese
O padrão Singleton é um dos padrões de design mais simples e amplamente utilizados, fornecendo uma solução clara para garantir a existência de uma única instância de uma classe com acesso controlado.

Características principais do Singleton:
*   **Instância única**: A classe gerencia uma única instância de si mesma.
*   **Acesso global**: Fornece um método global para acessar essa instância única.
*   **Controle de instância**: A criação da instância é controlada de forma a garantir que apenas uma instância seja criada.

Vantagens:
*   **Controle de acesso**: Garante o controle sobre como e quando a instância é criada.
*   **Consistência**: Mantém a consistência ao assegurar que apenas uma instância existe.
*   **Facilidade de acesso**: Fornece um ponto de acesso global à instância.

Desvantagens:
*   **Dificuldade em testes**: Pode ser difícil de testar devido à dependência global.
*   **Problemas de concorrência**: Necessita de tratamento adequado para evitar problemas em ambientes multithread.

Quando usar:
* Quando uma única instância de uma classe é necessária para controlar recursos, como conexões de banco de dados ou gerenciadores de configuração.
* Quando é necessário garantir que uma única instância de uma classe seja acessível globalmente.

Sobre o projeto:
Vou fazer um gerenciador de temas que permite mudar temas dinamicamente.
Uma aplicação dessas feita com o Singleton garante que todas as partes da aplicação usem o mesmo tema e apliquem as mudanças de forma consistente.

![Singleton](/assets/singleton.png)
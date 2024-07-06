# Prototype
[English Version](#english)

[Portuguese Version](#portuguese) 
## English
It allows new objects to be created from an existing prototype by copying that prototype. Instead of creating objects from scratch or via a constructor, the Prototype pattern uses a cloning method.
Main features:
*   **Object Cloning**: Instead of instantiating objects directly, you create an object from a prototype (an existing object), copying its properties and state.
*   **Instantiation Cost Reduction**: Cloning an object can be more efficient than creating an object from scratch, especially if the creation process is complex or costly.
*   **Simplification of Object Creation**: Facilitates the creation of objects with complex configurations, as you can use a configured prototype as a base.

Benefits:
*   **Ease of Creation**: Simplifies the process of creating complex objects.
*   **Reduces redundancy**: Avoids the need to repeat code and configuration processes.
*   **Flexibility**: Allows you to create new objects with variations from a base prototype.

Implementation:
A prototype object defines a cloning method, usually called a clone.
When a new object is required, the prototype is cloned, and its properties can be adjusted as necessary.

About the project:
I will make an example of how it works to clone an enemy in a game.
![Prototype](/assets/prototype.png)

## Portuguese
Permite a criação de novos objetos a partir de um protótipo existente, copiando este protótipo. Em vez de criar objetos do zero ou através de um construtor, o padrão Prototype utiliza um método de clonagem.
Características Principais:
*    **Clonagem de Objetos**: Em vez de instanciar objetos diretamente, você cria um objeto a partir de um protótipo (um objeto existente), copiando suas propriedades e estado.
*    **Redução de Custo de Instanciação**: Clonar um objeto pode ser mais eficiente do que criar um objeto do zero, especialmente se o processo de criação for complexo ou custoso.
*   **Simplificação da Criação de Objetos**: Facilita a criação de objetos com configurações complexas, pois você pode usar um protótipo configurado como base.

Benefícios:
*    **Facilidade de Criação**: Simplifica o processo de criação de objetos complexos.
*    **Reduz Redundância**: Evita a necessidade de repetir códigos e processos de configuração.
*    **Flexibilidade**: Permite criar novos objetos com variações a partir de um protótipo base.

Implementação:
Um objeto protótipo define um método de clonagem, geralmente chamado clone.
Quando um novo objeto é necessário, o protótipo é clonado, e suas propriedades podem ser ajustadas conforme necessário.

Sobre o projeto:
Irei fazer um exemplo de como funciona para clonar um inimigo em um jogo.
![Prototype](/assets/prototype.png)
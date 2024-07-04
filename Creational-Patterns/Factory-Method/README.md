## Factory Method
[English Version](#english)

[Portuguese Version](#portuguese)  

## English
reation pattern that provides an interface for creating objects in a superclass, but allows subclasses to change the type of objects that will be created.
This pattern defines a method, usually abstract or virtual, that subclasses will override to instantiate specific objects.
Benefits of the Factory Method
*   **Decoupling**: Separates the object creation code from the usage code, making it easier to maintain and evolve the software.
*   **Flexibility**: Allows objects to be created without specifying the exact class of the object to be created, making it easier to extend the system with new types of objects.
*   **Facilitates** testing: By using factories to create objects, you can easily replace real implementations with mocks or stubs during unit tests.
*   **Code Reuse**: Common object creation code can be reused in different contexts via the factory superclass or interface.
Factory Method disadvantages
**Additional Complexity**: Introduces additional complexity into the code, as it requires the creation of multiple classes and interfaces to implement the pattern.
*   **Overloads Design**: Can lead to an overloaded and difficult to understand design if used inappropriately or in situations where a simple object creation would suffice.
*   **Tracking Difficulty**: Extensive use of the pattern can make it difficult to track where and how objects are being instantiated, complicating understanding of program flow.
The Factory Method is particularly useful in scenarios where:
* The system needs to deal with objects of different types or classes that may be expanded in the future.
* The client code should not depend directly on concrete classes, allowing for greater flexibility and expandability.
* There is a need to control or centralize the creation of objects at a specific point in the system.
About the project:
I will make a Notification System with different notification types.
This will make it easier to integrate with possible new notification methods.
![Factory-Method-English](/assets/Factory-Method-English.png)

## Portuguese
Padrão criacional que fornece uma interface para criar objectos numa superclasse, mas permite que as subclasses alterem o tipo de objectos que serão criados.
Este padrão define um método, normalmente abstrato ou virtual, que as subclasses irão substituir para instanciar objectos específicos.
Benefícios do Factory Method
*    **Desacoplamento**: Separa o código de criação de objetos do código de uso, facilitando a manutenção e a evolução do software.
*   **Flexibilidade**: Permite a criação de objetos sem especificar a classe exata do objeto a ser criado, facilitando a extensão do sistema com novos tipos de objetos.
*    **Facilita Testes**: Ao utilizar fábricas para criar objetos, é possível substituir facilmente implementações reais por mocks ou stubs durante os testes unitários.
*    **Reutilização de Código**: Código comum de criação de objetos pode ser reutilizado em diferentes contextos através da superclasse ou interface de fábrica.
Malefícios do Factory Method
*    **Complexidade Adicional**: Introduz complexidade adicional no código, pois requer a criação de múltiplas classes e interfaces para implementar o padrão.
*    **Sobrecarrega o Design**: Pode levar a um design sobrecarregado e difícil de entender se usado de forma inadequada ou em situações onde uma simples criação de objeto seria suficiente.
*    **Dificuldade de Rastreamento**: O uso extensivo do padrão pode dificultar o rastreamento de onde e como os objetos estão sendo instanciados, complicando o entendimento do fluxo do programa.
O Factory Method é particularmente útil em cenários onde:
*    O sistema precisa lidar com objetos de diferentes tipos ou classes que podem ser expandidos no futuro.
*    O código cliente não deve depender diretamente de classes concretas, permitindo maior flexibilidade e capacidade de expansão.
*    Existe a necessidade de controlar ou centralizar a criação de objetos em um ponto específico do sistema.
Sobre o Projeto:
Irei fazer um Sistema de Notificação com diferentes tipos de notificação.
Isso permite facilitar a integração com possiveis novos meios de notificação.
![Factory-Method-Portuguese](/assets/Factory-Method-Portuguese.png)
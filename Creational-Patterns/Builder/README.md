# Builder
[English Version](#english)

[Portuguese Version](#portuguese) 
## English
It separates the construction of an object from its representation, allowing the same construction process to create different representations.

Main features:
*   **Separation of the construction process**: Builder divides the construction of an object into distinct stages, which can be carried out independently. Each stage adds or configures a specific part of the object.
*   **Complex Objects**: This is especially useful for creating objects that have many parts or properties, where creation can be complex and involve several steps or decisions.
*   **Building Code Reuse**: Allows the building code of common parts to be reused, even when the final objects are different.
*   **Director**: An optional component, called "Director", can be used to control the construction process, defining the order and steps the Builder must follow to build the object.

Benefits:
*   **Eases maintenance**: Each part of the construction process is isolated, making the code easier to understand and maintain.
*   **Flexibility**: You can create different representations of the same object simply by changing the logic in the Builder.
*   **Clarity**: Separates the object's creation logic from its usage logic, making the code clearer and more modular.

About the project:
I'm going to make an Application for creating personalized characters for an RPG style game.
The characters can have various characteristics and attributes, such as name, class, skills, equipment, appearance and story.
Making this project using Builder gives you flexibility, modularity, reusability and ease of maintenance.

![Builder-English](/assets/Builder-English.png)

## Portuguese
Ele separa a construção de um objeto da sua representação, permitindo que o mesmo processo de construção possa criar diferentes representações.

Principais características:
*    **Separação do Processo de Construção**: O Builder divide a construção de um objeto em etapas distintas, que podem ser executadas de forma independente. Cada etapa adiciona ou configura uma parte específica do objeto.
*   **Objetos Complexos**: É especialmente útil para criar objetos que têm muitas partes ou propriedades, onde a criação pode ser complexa e envolver várias etapas ou decisões.
*   **Reutilização do Código de Construção**: Permite reutilizar o código de construção de partes comuns, mesmo quando os objetos finais são diferentes.
*   **Diretor (Director)**: Um componente opcional, chamado "Diretor", pode ser utilizado para controlar o processo de construção, definindo a ordem e as etapas que o Builder deve seguir para construir o objeto.

Benefícios:
*   **Facilita a manutenção**: Cada parte do processo de construção é isolada, tornando o código mais fácil de entender e manter.
*   **Flexibilidade**: Permite criar diferentes representações do mesmo objeto, simplesmente alterando a lógica no Builder.
*   **Clareza**: Separa a lógica de criação do objeto da sua lógica de uso, tornando o código mais claro e modular.

Sobre o projeto:
Vou fazer um Aplicativo para criação de personagens personalizados para um jogo estilo RPG.
Os personagens podem ter várias características e atributos, como nome, classe, habilidades, equipamentos, aparência e história.
Fazer este projeto usando o Builder garante flexibilidade, modularidade, reutilização e facilidade de manutenção.

![Builder-Portuguese](/assets/Builder-Portuguese.png)
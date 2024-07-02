# Abstract-Factory
[English Version](#english)

[Portuguese Version](#portuguese) 
## English
The Abstract Factory design pattern is a creation pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes. In other words, it allows you to produce different types of related objects without knowing their exact classes at the time of creation.
Advantages:
*   **Decoupling**: The client uses only abstract interfaces, allowing it to work with any set of concrete products without worrying about their implementations.
*   **Coherence**: Ensures that the products created by a concrete factory are compatible with each other, which is useful when it comes to user interfaces that must have a consistent look and feel.
*   **Easy to change product families**: Changes from one product family to another can be made easily by changing the concrete factory used.
Disadvantages:
*   **Complexity**: Adds complexity to the code due to the creation of multiple interfaces and factory classes.
*   **Extension difficulty**: Adding new products to the family can be difficult as it involves modifying the abstract factory interface and all its concrete implementations.
*   **Rigid to change**: Changes to a product family may require changes to all the concrete factories.
When to use:
*   **Implementation Independence**: When you want the system to be independent of how its objects are created, composed and represented. Abstract Factory allows you to hide the concrete implementations of products.
*   **Related Product Families**: When you need to create families of products that should be used together. This ensures that the products in a family are compatible with each other.
*   **Interface Consistency**: When you need to ensure that products created by a concrete factory are compatible and have a consistent look and feel.
*   **Ease of Switching Implementations**: When you want to easily switch between different product families without changing the customer's code.
*   **Segregation of responsibility**: When you want to delegate responsibility for creating products to a specific class, keeping the client code cleaner and focused on business logic.
*   **Maintenance and Extensibility**: When you anticipate that new product families may be added in the future and want to ensure that this can be done without major changes to the existing code.

## Portuguese
O padrão de projeto Abstract Factory é um padrão de criação que fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas. Em outras palavras, ele permite que você produza diferentes tipos de objetos relacionados sem conhecer suas classes exatas no momento da criação.
Vantagens:
*    **Desacoplamento**: O cliente usa apenas interfaces abstratas, permitindo que ele funcione com qualquer conjunto de produtos concretos sem se preocupar com suas implementações.
*    **Coerência**: Garante que os produtos criados por uma fábrica concreta sejam compatíveis uns com os outros, o que é útil quando se trata de interfaces de usuário que devem ter uma aparência e comportamento consistentes.
*    **Facilidade de troca de famílias de produtos**: Mudanças de uma família de produtos para outra podem ser feitas facilmente trocando a fábrica concreta utilizada.
Desvantagens:
*    **Complexidade**: Adiciona complexidade ao código devido à criação de múltiplas interfaces e classes de fábrica.
*    **Dificuldade de extensão**: Adicionar novos produtos à família pode ser difícil, pois implica em modificar a interface da fábrica abstrata e todas as suas implementações concretas.
*    **Rígido para mudanças**: Mudanças em uma família de produtos podem requerer mudanças em todas as fábricas concretas.
Quando usar:
*   **Independência de Implementação**: Quando você quer que o sistema seja independente de como seus objetos são criados, compostos e representados. Abstract Factory permite ocultar as implementações concretas dos produtos.
*   **Famílias de Produtos Relacionados**: Quando você precisa criar famílias de produtos que devem ser usados juntos. Isso garante que os produtos de uma família sejam compatíveis uns com os outros.
*   **Consistência de Interface**: Quando é necessário garantir que os produtos criados por uma fábrica concreta sejam compatíveis e tenham uma aparência e comportamento consistentes.
*   **Facilidade de Troca de Implementações**: Quando você quer trocar facilmente entre diferentes famílias de produtos sem alterar o código do cliente.
*   **Segregação de Responsabilidades**:Quando você deseja delegar a responsabilidade da criação dos produtos a uma classe específica, mantendo o código do cliente mais limpo e focado na lógica de negócio.
*   **Manutenção e Extensibilidade**:Quando você prevê que novas famílias de produtos poderão ser adicionadas no futuro e quer garantir que isso possa ser feito sem grandes mudanças no código existente.


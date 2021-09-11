# Conhece classes abstratas?
## - O que é verdade sobre classes abstratas? Selecione todas as afirmações verdadeiras
-- Podem ter atributos:
-Correto, podemos sim ter atributos! Uma classes abstrata é uma classe normal, só não pode instanciar e pode ter métodos abstratos. O resto continua valendo!

-- Podem ter métodos concretos (com implementação):
- Correto, como podem ter atributos também podem ter métodos concretos!

-- Podem ter métodos abstratos (sem implementação):
- Correto, como vimos uma classe abstrata pode ter métodos sem implementação. Dessa forma obrigamos um filho implementar o método.

-- Não podem ser instanciada:
- Correto, pois o que é abstrato (a classe) não pode se tornar concreto (objeto). Por isso não podemos instanciar objetos de uma classe abstrata.

# Revisando conceitos de herança
## Como vimos durante o curso e revisamos durante este capítulo, quais das afirmativas abaixo descreve uma vantagem do uso de herança?
-- A herança possui baixo acoplamento, logo é fácil mudar uma classe mãe sem causar problemas nas classes filhas.
- Errado, e justamente contrário. Há um acoplamento forte entre mãe e filho, por isso é preciso ter muito cautela na hora de usar a herança.

-- A herança captura o que é comum e isola aquilo que é diferente entre classes.
- Correto

-- A herança apenas serve para definir um contrato entre classes.
- Errado! Na verdade a "criação de contratos" é feita pelas interfaces.

# Revisando conceitos de interface
## Como vimos durante o curso e revisamos durante este capítulo, quais das afirmativas abaixo descreve uma vantagem do uso de interfaces?
-- Permite atributos e com isso melhora a legibilidade do código.
- Errado! Interfaces não podem possuir atributos.

-- Garante que todos os métodos de classes que implementam uma interface possam ser chamados com segurança.
- Correto! Isso é a ideia do contrato, garantindo que a classe tenha um comportamento, basta assinar o contrato (implementar a inteface).

-- Ao serem estendidas, geram um contrato entre a interface e a classe que chamou.
- Errado. Na verdade interfaces são implementadas, não estendidas.

# Composição x Herança
## Qual das afirmativas a seguir representa uma vantagem do uso de composição e interfaces sobre o uso de herança?

-- Não há vantagem alguma pode escolher o que você julga melhor.
- Errado! Na verdade existem algumas vantagens. Normalmente o uso de interfaces (para definir o contrato e ter polimorfismo) e composição (para ter reutilização de código) é mais flexível comparado a herança.

-- Com composições e interfaces teremos mais flexibilidade com nosso código, já que não nos prenderemos ao acoplamento que a herança propõe.
- Correto

-- A herança é limitada ao polimorfismo, enquanto o uso de interfaces com composição possibilita polimorfismo E reutilização de código.
- Errado pois Herança possibilita sim polimorfismo E reutilização. Com interfaces temos uma alternativa ao polimorfismo, com a composição temos uma alternativa a reutilização de código.
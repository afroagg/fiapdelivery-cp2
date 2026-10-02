# FiapDelivery

Refatoração do código legado do FiapDelivery, o sistema de logística do FiapRide. O código original até compilava e rodava, mas tinha nomes sem sentido, todos os dados expostos, código duplicado e uma rota que só aceitava caminhão. A ideia aqui foi reorganizar tudo aplicando o que vimos em aula de Orientação a Objetos e Clean Code.

Atividade do Check Point 2 da disciplina de Programação Orientada a Objetos (FIAP).

## O que mudou

**Nomes:** atributos como `pl`, `cap`, `p` e `s` viraram `placa`, `capacidade`, `peso` e `status`. Os métodos `muda()` e `vai()` viraram `mudarStatus()` e `executarRota()`, e as classes passaram a começar com letra maiúscula.

**Encapsulamento:** todos os atributos agora são `private`. A leitura é feita por getters e as alterações passam por setters privados com validação. Antes dava pra criar um caminhão com capacidade `-500.0`, agora o sistema bloqueia. O status do pacote também só aceita `Pendente`, `Em rota`, `Entregue` ou `Cancelado`.

**Construtores:** nenhum objeto nasce vazio. Um pacote precisa de código e peso pra existir, e sempre começa com status `Pendente`. Os veículos precisam de placa e capacidade.

**Herança:** `caminhao` e `moto` repetiam os mesmos atributos. Agora existe a classe mãe `Veiculo` com `placa` e `capacidade`, e `Caminhao` e `Moto` herdam dela, cada um com o que é só seu (`eixos` no caminhão, `bau` na moto).

**Associação:** a `Rota` antes só aceitava caminhão. Agora ela recebe um `Veiculo`, então funciona tanto com caminhão quanto com moto, sem precisar mexer na classe.

## Estrutura

```
src/br/com/fiapdelivery/
├── model/
│   ├── Veiculo.java
│   ├── Caminhao.java
│   ├── Moto.java
│   ├── Pacote.java
│   └── Rota.java
└── main/
    └── SistemaPrincipal.java
```

O diagrama de classes feito no Astah está na raiz do repositório.

## Tecnologias

`Java` · `Eclipse` · `Astah UML` · `Git/GitHub`

## Rodando localmente

Clone o repositório:

```
git clone https://github.com/seu-usuario/nome-do-repositorio.git
```

Importe o projeto no Eclipse, abra o `SistemaPrincipal.java` e rode com `Ctrl + F11`. O console mostra as rotas sendo executadas com caminhão e moto, e no final alguns testes tentando passar valores inválidos pra mostrar que as validações funcionam.

Feito por [Agatha Rodrigues](https://www.linkedin.com/in/agatha-carolina-rodrigues-887567250)
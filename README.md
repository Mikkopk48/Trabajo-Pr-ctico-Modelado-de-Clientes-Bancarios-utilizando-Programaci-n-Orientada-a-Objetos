# Trabajo-Practico-Modelado-de-Clientes-Bancarios-utilizando-Programacion-Orientada-a-Objetos

Este es un sistema creado por Mikko Piaggio como trabajo práctico para la diplomatura en desarrollo fintech.
En la carpeta clientes se encuentran 4 clases que simulan ser 3 tipos de clientes en un sistema bancario y una clase base llamada cliente de la cual heredan estos clientes a la vez que agregan distintos atributos y metodos.

Mensión especial al profe Nico que explica muy bien.

classDiagram
    direction TB

    class Main {
        +main(args) void
    }

    class Client {
        <<abstract>>
        -UUID id
        -String address
        -String phoneNumber
        -String email
        -LocalDate bankRegistrationDate
        -BigDecimal declaredIncome
        +showClient() void
        +getId() UUID
    }

    class IndividualClient {
        -Integer DNI
        -LocalDate birthDate
        -String profession
        -String firstName
        -String lastName
        +showClient() void
    }

    class PremiunClient {
        -Integer DNI
        -LocalDate birthDate
        -String profession
        -String specialCreditLimit
        -String asignedEjective
        -String specialBenefits
        -String firstName
        -String lastName
        +showClient() void
    }

    class ClientCompany {
        -String companyName
        -String CUIL
        -String companyActivity
        -String legalRepesentative
        +showClient() void
    }

    Client <|-- IndividualClient : hereda
    Client <|-- PremiunClient : hereda
    Client <|-- ClientCompany : hereda

    Main ..> IndividualClient : crea y utiliza
    Main ..> PremiunClient : crea y utiliza
    Main ..> ClientCompany : crea y utiliza

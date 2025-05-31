Sistema Distribuído de Pedidos com Filas e Eventos de Processamento e Entrega

Objetivo: Desenvolver um sistema distribuído utilizando Spring Boot, RabbitMQ e Spring Cloud Stream para simular o ciclo de vida de um pedido em um e-commerce, envolvendo:

Fila de processamento de pedidos
Fila de transporte/entrega
Eventos disparados para múltiplos serviços após cada etapa

Cenário: Um cliente envia um pedido via REST. O pedido entra em uma fila de processamento, e após ser processado, é enviado para uma fila de transporte. Cada etapa gera eventos (pub/sub) que notificam outros serviços:

Processamento do pedido: O pedido é retirado da fila fila-processamento-pedidos
Gera um evento: pedido-processado
Transporte do pedido: O pedido é retirado da fila fila-transporte-pedidos
Gera um evento: pedido-entregue

Os eventos pedido-processado e pedido-entregue são publicados para os serviços de:
Notificação (para avisar o cliente)
Auditoria (para registrar as ações)

Projeto feito com SpringBoot, RabbitMQ e utilizando imagem Docker, com o docker desktop aberto, dar o comando:
docker run -d --hostname rabbit --name rabbit -p 5672:5672 -p 15672:15672 rabbitmq:3-management
Para monitorar se o docker está rodando:
docker ps
Se precisar reiniciar o container:
docker restart rabbit
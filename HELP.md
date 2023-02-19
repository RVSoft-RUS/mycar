# Getting Started

api-gateway на spring boot 3 почему то не работает - нужно разбираться в причинах.

Временно настроил работу через api-gateway-2sb на spring boot 2.7.
Напрямую к клиенту обращаться : http://localhost:{port}/test
Через шлюз : http://localhost:8765/mycar-client/test - идет обращение по round robin ко всем инстансам клиентов mycar-client



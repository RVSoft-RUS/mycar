#Файл для запуска проекта в Docker
./mvnw clean package
docker build . -t rvsoft/mycar-client:1.0
#Для старта контейнера
#docker run -ti --rm -e DATASOURCE_HOST=192.168.1.11 -p 8081:8080 rvsoft/mycar-client:1.0
#ip from
#ifconfig
#wlp2s0: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
#        inet 192.168.1.11  netmask 255.255.255.0  broadcast 192.168.1.255
#        inet6 fe80::3dd6:b84b:cb69:ca35  prefixlen 64  scopeid 0x20<link>
#        ether 70:66:55:97:ba:7f  txqueuelen 1000  (Ethernet)
#        RX packets 3887230  bytes 4270042320 (4.2 GB)
#        RX errors 0  dropped 0  overruns 0  frame 0
#        TX packets 1954353  bytes 528540382 (528.5 MB)
#        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

#docker push rvsoft/mycar-client:1.0
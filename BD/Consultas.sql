-- 1.	Cantidad de productos vendidos y valor por vendedor, ordenado por cantidad de mayor a menor
SELECT VENDEDOR.nom_vendedor AS vendedor, PEDIDO.cantidad, PEDIDO.valor
FROM PEDIDO 
INNER JOIN VENDEDOR ON PEDIDO.Id_Vendedor = VENDEDOR.idVendedor
ORDER BY PEDIDO.cantidad DESC;


-- 2.	Cantidad de productos vendidos por artistas ordenados de mayor a menor por cantidad de productos
SELECT ARTISTA.nom_artista AS artista,PRODUCTO.idProducto, COUNT(PEDIDO.cantidad) AS CantPedidos
FROM PEDIDO 
INNER JOIN PRODUCTO ON PEDIDO.IdProducto = PRODUCTO.idProducto
INNER JOIN ARTISTA ON producto.idArtista = ARTISTA.idArtista
GROUP BY PEDIDO.cantidad
ORDER BY CantPedidos DESC;


-- 3.	Cantidad total de productos vendidos.
SELECT SUM(PEDIDO.cantidad) AS CantidadTotalProductos
FROM PEDIDO;


-- 4.	Mejores clientes con cantidad total de pedidos y valor total comprado, ordenados por cantidad de pedidos de mayor a menor.
SELECT CLIENTE.Nom_clien AS Cliente, COUNT(PEDIDO.cantidad) AS CantPedidos, SUM(PEDIDO.valor) AS ValorPedidos
FROM PEDIDO 
INNER JOIN CLIENTE ON PEDIDO.Id_Cliente = CLIENTE.idCliente
GROUP BY PEDIDO.cantidad
ORDER BY CantPedidos DESC;


-- 5.	Cantidad de pedidos por productor y producto, ordenados por cantidad de pedidos de mayor a menor.
SELECT PRODUCTOR.nom_productor AS productor, PRODUCTO.idProducto, COUNT(PEDIDO.cantidad) AS CantPedidos
FROM PEDIDO 
INNER JOIN PRODUCTO ON PEDIDO.IdProducto = PRODUCTO.idProducto
INNER JOIN PRODUCTOR ON PRODUCTO.idProductor = PRODUCTOR.idProductor
GROUP BY PEDIDO.cantidad
ORDER BY CantPedidos DESC;

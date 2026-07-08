
*EXPLICACION DEL MAP (METODO B)*
------------------------------------
Para hacer el Map implementamos el método groupCodesByStock que basicamente
se encarga de agrupar los códigos de los insumos según la cantidad de stock
que tengan disponible.

La clasificación se realiza de la siguiente manera:
Si el stock es mayor o igual a 50  se guarda en la categoría HIGH.
Si el stock es mayor o igual a 20 y menor a 50  se guarda en la categoría MEDIUM.
Si el stock es menor a 20 se guarda en la categoría LOW.

Para lograr esto utilizamos un TreeMap   donde la clave representa la categoría
HIGH, MEDIUM o LOW y el valor es una lista con los códigos de los insumos
que pertenecen a esa categoría Finalmente antes de agregar un coldigo se
verifica que no exista previamente para evitar duplicados ene el mismo.
*EXPLICACION DEL SET (METODO A)*
------------------------------------
Para hacer el Set implementamos el metodo filterAndSortSupplies que básicamente
filtra los insumos segun el stock mínimo recibido y los guarda en un TreeSet.
Primero se verifica que la lista no sea nula y Luego se ordenan los insumos
de mayor a menor según el stock
Si dos insumos tienen el mismo stock, se ordenan por el código de forma
ascendente ignorando mayúsculas y minúsculas.
Finalmente solo se agregan al TreeSet los insumos cuyo stock sea mayor o
igual al stock mínimo. Al utilizar un TreeSet también se evitan elementos
duplicados.


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

# TallerSolidG3
Analisis del taller

1. En este apartado se esta violando el principio de sustitución de Liskov, dado que las clases Helado y Pastel, tienen bastante similitud y por ende se creo la clase Padre Postre y a su vez aplicamos el principio de abierto/cerrado, cambiamos los atributos de la clase Padre de private a protected.

2-3. En el apartado 2 y 3 podemos observar que se incumple el principio de responsabilidad unica, debido a que tenemos dos partes, el manejo de los postres (pastel y helado) que esta separado, mientras que el manejo de dinero se encuentra en las clases de los postres, por ende tenemos multiples tipos de operaciones en los postres, mientras que lo respecto a manejo del postre esta dividido en la clase de los postres y en la clase de proceso, se puede hacer uso del principio de sustitucion de Liskov para realizar una sola operacion de agregacion o eliminacion de los aderezos en la clase padre Postre, mientras que usamos el principio de responsabilidad unica, para que el manejo del postre solo en la clase Postre y la parte monetaria la manejamos en una clase aparte 

4. En este apartado se realizó un cambio a la clase enum AdicionalesAderezo para convertirla en abstract y asi poder cumplir con los principios de responsabilidad unica y de inversion de depencia

5. En este apartado se manejó el error a nivel bajo en la clase ManejadordeLeche, permitiendo cumplir el principio de inversion de depencia


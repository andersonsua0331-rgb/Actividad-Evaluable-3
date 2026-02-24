# Evaluación: Actividad Evaluable 3 - Arquitectura de Objetos Seguros

**Estudiante:** Anderson (202520001615)
**Puntaje Total:** 28 / 50 pts

## Criterios de Evaluación

| Criterio evaluado | Descripción | Puntaje Máximo | Puntaje Obtenido | Observaciones |
| :--- | :--- | :---: | :---: | :--- |
| **1. Atributos propios** | Declaración de los 5 atributos exigidos (`id`, `montoPrestado`, `saldoPendiente`, etc.) | 5 pts | 5 pts | Se declararon los atributos correctamente y con modificador `private`. |
| **2. Encapsulamiento y Reglas** | No permite saldos negativos, estado `esRiesgoso` dinámico de solo lectura. | 5 pts | 2 pts | El método `esRiesgoso()` se declara, pero dentro de la lógica de otros métodos se usa el atributo `esRiesgoso` que es estático y siempre falso. Tampoco se aplica de forma estricta la regla del saldo negativo en la disminución. |
| **3. Constructores** | Se cuenta con los tres constructores sobrecargados (Estándar, Refinanciación, VIP). | 5 pts | 5 pts | Los tres constructores (VIP, estándar y refinanciamiento) están implementados. |
| **4. Método abonarCapital** | Valida disminución con cantidad positiva según el comportamiento pedido. | 5 pts | 1 pts | El método está implementado, pero no valida que el saldo abonado sea positivo. |
| **5. Método capitalizarIntereses** | Suma interés basado en tasa e imprime alerta si se vuelve riesgoso. | 5 pts | 1 pts | Se intentó implementar, sin embargo, el código contiene un error de sintaxis grave (una llave de cierre `}` extra en la línea 72) que impide la compilación de todo el archivo. |
| **6. intentarLiquidacionMaliciosa** | Demuestra error de compilación por el acceso directo a saldo y el abono negativo. | 5 pts | 2 pts | Se intenta hacer el abono negativo, pero no hay evidencia (en código o comentario) del intento de acceso directo para demostrar la protección del compilador. |
| **7. aplicarAlivioFinanciero** | Reduce un 50% el saldo de manera correcta (demuestra el paso por referencia). | 5 pts | 5 pts | Correcto. Se calcula y abona la mitad usando los getters/métodos correspondientes. |
| **8. Escenario de Prueba (main)** | Instancia el crédito, avanza el tiempo interes x 5, audita el estado y ejecuta referencia. | 5 pts | 5 pts | El flujo de la simulación y creación de obj. está bien representado. |
| **9. Pregunta reflexiva** | Explica correctamente el paso por referencia en el escenario de prueba. | 5 pts | 0 pts | No hay respuesta en comentarios de la pregunta reflexiva. |
| **10. Orden del desarrollador** | Limpieza en el código, buenas prácticas, legibilidad, nomenclatura y tabulación. | 5 pts | 2 pts | Existen errores de sintaxis que impiden que el código compile, espaciado irregular e inconsistente a lo largo del código. |

## Comentarios Finales
El programa está estructurado adecuadamente pero presenta un error sintáctico por una llave adicional al final del bloque `capitalizarIntereses` en `CreditoCorporativo`, lo que rompe la compilación. Faltó desarrollar de manera estricta las validaciones del saldo (que no descuente cantidades negativas o que la suma sea inválida) y completar el análisis reflexivo.

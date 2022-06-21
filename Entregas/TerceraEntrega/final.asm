include macros2.asm
include number.asm

.MODEL  SMALL
.386
.STACK 200h
.DATA

_@MENORIGUAL3 dd ?
_@SUMA17 dd, ?
_@SUMA19 dd, ?
_@DIV3 dd, ?
_@MULT7 dd, ?
_@SUMA18 dd, ?
_@SUMA20 dd, ?
_@AND3 dd ?
_@MAYOR3 dd ?
_@DIST3 dd ?
_@AVG7 dd, ?
_@DIVAVG7 dd, ?
_@AVG8 dd, ?
_@SUMA21 dd, ?
_@MULT8 dd, ?
_@SUMA22 dd, ?
_@DIVAVG8 dd, ?
_@SUMA24 dd, ?
_@AVG9 dd, ?
_@SUMA23 dd, ?
_@MULT9 dd, ?
_@DIVAVG9 dd, ?
__@d2 dd ?
__@d1 dd ?
__@contador dd ?
__@suma dd ?
__@palabra dd ?
__@contar dd ?
__@actual dd ?
__@var dd ?
__@a1 dd ?
__@e dd ?
__@d dd ?
__@c dd ?
__@b dd ?
__@a dd ?
__@var1 dd ?
_Prueba@puntotxtAnalizadorLexico db "Prueba.txtAnalizadorLexico", 26, 26, '$'
_0 dd 0
_76@punto5 dd 76,5
_18@punto22 dd 18,22
_9 dd 9
_1 dd 1
_0@punto342 dd 0,342
_4@punto67 dd 4,67
_Lavariablesuma db "Lavariablesuma", 14, 14, '$'
_2 dd 2
_actualesmayorque2ydistintode db "actualesmayorque2ydistintode", 28, 28, '$'
_esmayor db "esmayor", 7, 7, '$'
_noesmayorque2 db "noesmayorque2", 13, 13, '$'
_6 dd 6
_12 dd 12
_5 dd 5
_3 dd 3
_4 dd 4
_48 dd 48
_3@punto14 dd 3,14
_45 dd 45
_56 dd 56
_1@punto22 dd 1,22

.CODE

MOV AX,@DATA
MOV DS,AX
FINIT; Inicializa el coprocesador
displayString _Prueba@puntotxtAnalizadorLexico
newLine 1 

MOV EAX, _0
MOV __@contador, EAX

MOV EAX, _76@punto5
MOV __@suma, EAX

MOV EAX, _18@punto22
MOV __@contar, EAX

INST_WHILE_BEGIN3:
MOV EAX, __@contador
MOV EBX, _9
CMP EAX, EBX
JBE MINOR_EQ_TRUE3
MOV _@MENORIGUAL3, 0
JMP MINOR_EQ_END3
MINOR_EQ_TRUE3:
MOV _@MENORIGUAL3, 1
MINOR_EQ_END3:
MOV EAX, 1
MOV EBX, _@MENORIGUAL3
CMP EAX, EBX 
CMP _@MENORIGUAL3, 1
JNE INST_WHILE_END3
FLD __@contador
FLD _1
FADD
FSTP _@SUMA17
MOV EAX, _@SUMA17
MOV __@contador, EAX
FLD __@contador
FLD _0@punto342
FDIV
FSTP _@DIV3
FLD __@contar
FLD _4@punto67
FADD
FSTP _@SUMA18
FLD __@contador
FLD _@SUMA18
FMUL
FSTP _@MULT7
FLD _@DIV3
FLD _@MULT7
FADD
FSTP _@SUMA19
MOV EAX, _@SUMA19
MOV __@actual, EAX
FLD __@suma
FLD __@actual
FADD
FSTP _@SUMA20
MOV EAX, _@SUMA20
MOV __@suma, EAX
JMP INST_WHILE_BEGIN3
INST_WHILE_END3:

displayString _Lavariablesuma
newLine 1 

MOV EAX, __@actual
MOV EBX, _2
CMP EAX, EBX
JA GREATER_TRUE3
MOV _@MAYOR3, 0
JMP GREATER_END3
GREATER_TRUE3:
MOV _@MAYOR3, 1
GREATER_END3:
MOV EAX, _0
MOV EBX, __@actual
CMP EAX, EBX
JNE DIST_TRUE3
MOV _@DIST3, 0
JMP DIST_END3
DIST_TRUE3:
MOV _@DIST3, 1
DIST_END3:
MOV EAX, 1
MOV EBX, _@MAYOR3
CMP EAX, EBX
CMP _@MAYOR3, 1
JNE INST_AND_FALSE3
MOV EAX, 1
MOV EBX, _@DIST3
CMP EAX, EBX
CMP _@DIST3, 1
JNE INST_AND_FALSE3
MOV _@AND3, 1
JMP INST_AND_END3
INST_AND_FALSE3:
MOV _@AND3, 0
INST_AND_END3:
MOV EAX, 1
MOV EBX, _@AND3
CMP EAX, EBX 
CMP _@AND3, 1
JNE INST_IF_ELSE3
displayString _actualesmayorque2ydistintode
newLine 1 
MOV EAX, OFFSET _esmayor
MOV __@palabra, EAX
JMP INST_IF_END3
INST_IF_ELSE3:
displayString _noesmayorque2
newLine 1 
MOV EAX, OFFSET _esmayor
MOV __@palabra, EAX
INST_IF_END3:

MOV EAX, _6
MOV __@var1, EAX

MOV _@AVG7, 0
FLD _12
FLD _@AVG7
FADD
FSTP _@AVG7
FLD _5
FLD _@AVG7
FADD
FSTP _@AVG7
FLD __@var1
FLD _@AVG7
FADD
FSTP _@AVG7
MOV _@DIVAVG7, 3
FLD _@AVG7
FLD _@DIVAVG7
FDIV
FSTP _@AVG7
MOV EAX, _@AVG7
MOV __@d1, EAX

MOV EAX, _1
MOV __@a, EAX

MOV EAX, _2
MOV __@b, EAX

MOV EAX, _3
MOV __@c, EAX

MOV EAX, _4
MOV __@d, EAX

MOV EAX, _5
MOV __@e, EAX

MOV _@AVG8, 0
FLD _2
FLD _@AVG8
FADD
FSTP _@AVG8
FLD __@a
FLD __@b
FADD
FSTP _@SUMA21
FLD _@SUMA21
FLD _@AVG8
FADD
FSTP _@AVG8
FLD __@d
FLD __@e
FADD
FSTP _@SUMA22
FLD __@c
FLD _@SUMA22
FMUL
FSTP _@MULT8
FLD _@MULT8
FLD _@AVG8
FADD
FSTP _@AVG8
FLD _48
FLD _@AVG8
FADD
FSTP _@AVG8
MOV _@DIVAVG8, 4
FLD _@AVG8
FLD _@DIVAVG8
FDIV
FSTP _@AVG8
MOV EAX, _@AVG8
MOV __@d1, EAX

MOV EAX, _6
MOV __@a1, EAX

MOV _@AVG9, 0
FLD __@a1
FLD _45
FMUL
FSTP _@MULT9
FLD _@MULT9
FLD _6
FADD
FSTP _@SUMA23
FLD _@SUMA23
FLD _@AVG9
FADD
FSTP _@AVG9
FLD _56
FLD _@AVG9
FADD
FSTP _@AVG9
FLD _1@punto22
FLD _@AVG9
FADD
FSTP _@AVG9
MOV _@DIVAVG9, 3
FLD _@AVG9
FLD _@DIVAVG9
FDIV
FSTP _@AVG9
FLD _3@punto14
FLD _@AVG9
FADD
FSTP _@SUMA24
MOV EAX, _@SUMA24
MOV __@d2, EAX

FINAL:
   mov ah, 1 ; pausa, espera que oprima una tecla
   int 21h ; AH=1 es el servicio de lectura
   MOV AX, 4C00h ; Sale del Dos

   int 21h ; AH=4C00h sale del programa
END ; final del archivo.

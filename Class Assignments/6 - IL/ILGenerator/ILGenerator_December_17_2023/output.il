.assembly extern mscorlib {}
.assembly output {}
.module output.exe
.class private auto ansi beforefieldinit ConsoleApp1.Program extends [mscorlib]System.Object
{
.method private hidebysig static void  Main(string[] args) cil managed
{
.entrypoint
.maxstack  100
.locals init ([0] int64 T0)
.locals init ([1] int64 T1)
.locals init ([2] int64 T2)
.locals init ([3] int64 T3)
.locals init ([4] int64 T4)
.locals init ([5] int64 b)
.locals init ([6] int64 c)
.locals init ([7] int64 a)
.locals init ([8] int64 output)
nop
///////////////////////// IL CODE
ldc.i8 15
stloc b
ldc.i8 14
stloc c
ldloc b
ldloc c
cgt
stloc T0
ldloc b
ldloc c
ceq
stloc T1
ldc.i8 48
ldloc c
add
stloc T2
ldloc T1
brtrue Label1
br Label2
Label1:
ldloc b
br Label3 
Label2:
ldloc T2
Label3:
stloc T1
ldloc T0
brtrue Label4
br Label5
Label4:
ldloc T1
br Label6 
Label5:
ldloc c
Label6:
stloc T0
ldloc T0
stloc a
ldloc a
stloc output

///////////////////////// IL CODE
ldloca.s   output
call       instance string [mscorlib]System.Int64::ToString()
call       void [mscorlib]System.Console::WriteLine(string)
nop
ret
} // end of method Program::Main
.method public hidebysig specialname rtspecialname instance void  .ctor() cil managed
{
.maxstack  8
ldarg.0
call       instance void [mscorlib]System.Object::.ctor()
nop
ret
} // end of method Program::.ctor
} // end of class

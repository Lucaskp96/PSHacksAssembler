max r1 r2 
macro max a b result
   @a
   D=M              // D = first number

   @b
   D=D-M            // D = first number - second number

   @OUTPUT_FIRST.SER
   D;JGT            // if D>0 (first is greater) goto output_first

   @b
   D=M              // D = second number

   @OUTPUT_D.SER
   0;JMP            // goto output_d

(OUTPUT_FIRST.SER)
   @a             
   D=M              // D = first number

(OUTPUT_D.SER)
   @result
   M=D              // M[2] = D (greatest number)
endmacro
add a b
macro infiniteLoop
(INFINITE_LOOP.SER)
   @INFINITE_LOOP.SER
   0;JMP            // infinite loop
endmacro

(test)
infiniteLoop
   @R0             
   D=M              
(test2)
   @R2
   M=D


bits 32

global _start

section .data
Hello db 'Hello world', 10

section .text
_start:
    push    ebp
    mov     ebp, esp
    mov     eax, 4 ; sys_write
    mov     ebx, 1 ; stdout
    mov     ecx, Hello
    mov     edx, 13
    int     0x80

    mov     eax, 1
    xor     ebx, ebx ; ebx = 0
    int     0x80

global est_impair

section .text
; code 64 bits
; bool est_impair
; n => edi
est_impair:
	mov		eax,	edi		;eax <- edi
	xor		edx,	edx		;edx <- 0
	mov		ecx,	10		;ecx <- 10
	div		ecx				;eax <- eax /ecx, (u) edx <- eax % ecx
	mov		eax, 	1		;eax <- 1, valeur de retour true
	cmp		edx, 	1		;si u == 1 alors sortir de la fonction
	je		.end
	cmp		edx, 	3		;si u == 3 alors sortir de la fonction
	je		.end
	cmp		edx, 	5		;si u == 5 alors sortir de la fonction
	je		.end
	cmp		edx, 	7		;si u == 7 alors sortir de la fonction
	je		.end
	cmp		edx, 	9		;si u == 9 alors sortir de la fonction
	je		.end
	xor		eax, 	eax		;sinon, le nombre est pair on sort avec
							;la valeur 0 (false)
.end:
	ret

package br.senai.sp.jandira.imc_app_b

fun calcularNdc(genero: Char, peso: Double, idade: Int, nivelAtividade: Int): Double {

    if (genero == 'm') {

        if (nivelAtividade == 0) {
            if (idade == 0) {
                return 15.3 * peso + 679
            } else if (idade == 1) {
                return 11.6 * peso + 879
            } else {
                return 13.5 * peso + 487
            }
        }
        else if (nivelAtividade == 1) {
            if (idade == 0) {
                return (15.3 * peso + 679) * 1.5
            } else if (idade == 1) {
                return (11.6 * peso + 879) * 1.5
            } else {
                return (13.5 * peso + 487) * 1.5
            }
        }
        else if (nivelAtividade == 2) {
            if (idade == 0) {
                return (15.3 * peso + 679) * 1.8
            } else if (idade == 1) {
                return (11.6 * peso + 879) * 1.8
            } else {
                return (13.5 * peso + 487) * 1.8
            }
        }
        else if (nivelAtividade == 3) {
            if (idade == 0) {
                return (15.3 * peso + 679) * 2.1
            } else if (idade == 1) {
                return (11.6 * peso + 879) * 2.1
            } else {
                return (13.5 * peso + 487) * 2.1
            }
        }
    }

    else {
        if (nivelAtividade == 0) {
            if (idade == 0) {
                return 14.7 * peso + 496
            } else if (idade == 1) {
                return 8.7 * peso + 829
            } else {
                return 10.5 * peso + 596
            }
        }
        else if (nivelAtividade == 1) {
            if (idade == 0) {
                return (14.7 * peso + 496) * 1.6
            } else if (idade == 1) {
                return (8.7 * peso + 829) * 1.6
            } else {
                return (10.5 * peso + 596) * 1.6
            }
        }
        else if (nivelAtividade == 2) {
            if (idade == 0) {
                return (14.7 * peso + 496) * 1.6
            } else if (idade == 1) {
                return (8.7 * peso + 829) * 1.6
            } else {
                return (10.5 * peso + 596) * 1.6
            }
        }
        else if (nivelAtividade == 3) {
            if (idade == 0) {
                return (14.7 * peso + 496) * 1.8
            } else if (idade == 1) {
                return (8.7 * peso + 829) * 1.8
            } else {
                return (10.5 * peso + 596) * 1.8
            }
        }
    }
    return 0.0
}
fun greet(input: String?): String =
    input
        ?.trim()
        ?.takeIf { it.isNotEmpty() }
        ?.let { "Bonjour, $it !" }
        ?: ""

fun parseCount(input: String?): Int =
    input
        ?.trim()
        ?.toIntOrNull()
        ?.coerceAtLeast(0)
        ?: 0

fun safeAt(xs: List<Int>, index: Int): Int =
    xs.getOrNull(index) ?: -1

fun parseAnyToNonNegativeInt(x: Any?): Int =
    (x as? String)?.toIntOrNull()?.coerceAtLeast(0) ?: 0

fun pipeline(name: String?, countText: String?): String =
    "${greet(name)}#${parseCount(countText)}"

fun lengthOrZero(s: String?): Int = s?.length ?: 0

fun nonNullOrFail(s: String?): String =
    requireNotNull(s) { "Valeur requise non fournie" }

fun main() {
    println("=== DEMO Null-safety ===")

    // Étape 2 : Démo greet
    println("greet(null): '${greet(null)}'")
    println("greet('  '): '${greet("  ")}'")
    println("greet('  Ada '): '${greet("  Ada ")}'")

    // Étape 3 : Démo parseCount
    println("parseCount(null): ${parseCount(null)}")
    println("parseCount(' -5 '): ${parseCount(" -5 ")}")
    println("parseCount(' 12 '): ${parseCount(" 12 ")}")

    // Étape 4 : Démo safeAt
    println("safeAt(listOf(10, 20), 1): ${safeAt(listOf(10, 20), 1)}")
    println("safeAt(listOf(10, 20), 9): ${safeAt(listOf(10, 20), 9)}")

    // Étape 5 : Démo parseAnyToNonNegativeInt et pipeline
    println("parseAnyToNonNegativeInt('42'): ${parseAnyToNonNegativeInt("42")}")
    println("parseAnyToNonNegativeInt('x'): ${parseAnyToNonNegativeInt("x")}")
    println("parseAnyToNonNegativeInt(null): ${parseAnyToNonNegativeInt(null)}")
    println("pipeline(' Ada ', ' 12 '): '${pipeline(" Ada ", " 12 ")}'")

    // Étape 6 : Démo alternatives à !!
    println("lengthOrZero(null): ${lengthOrZero(null)}")
    println("lengthOrZero('Kotlin'): ${lengthOrZero("Kotlin")}")
    println("nonNullOrFail('OK'): '${nonNullOrFail("OK")}'")
}

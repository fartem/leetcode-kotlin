package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CheckIfAStringIsAnAcronymOfWordsTest {
    private val solution = CheckIfAStringIsAnAcronymOfWords()

    @Test
    fun testDefaultOne() {
        assertTrue {
            solution.isAcronym(
                listOf("alice", "bob", "charlie"),
                "abc"
            )
        }
    }

    @Test
    fun testDefaultTwo() {
        assertFalse {
            solution.isAcronym(
                listOf("an", "apple"),
                "a"
            )
        }
    }

    @Test
    fun testDefaultThree() {
        assertTrue {
            solution.isAcronym(
                listOf("never", "gonna", "give", "up", "on", "you"),
                "ngguoy"
            )
        }
    }
}

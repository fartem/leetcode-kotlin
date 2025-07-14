package xyz.fartem.leetcodekotlin.medium

class CountDaysWithoutMeetings {
    fun countDays(days: Int, meetings: Array<IntArray>): Int {
        meetings.sortWith(compareBy { it[0] })

        val merged = mutableListOf<IntArray>()
        merged.add(intArrayOf(meetings[0][0], meetings[0][1]))

        for (i in 1 until meetings.size) {
            val last = merged.last()
            val current = meetings[i]

            if (current[0] <= last[1] + 1) {
                last[1] = maxOf(last[1], current[1])
            } else {
                merged.add(intArrayOf(current[0], current[1]))
            }
        }

        var meetingDays = 0

        for (interval in merged) {
            val start = interval[0]
            val end = interval[1]
            val clampedStart = maxOf(start, 1)
            val clampedEnd = minOf(end, days)

            if (clampedStart <= clampedEnd) {
                meetingDays += clampedEnd - clampedStart + 1
            }
        }

        return days - meetingDays
    }
}

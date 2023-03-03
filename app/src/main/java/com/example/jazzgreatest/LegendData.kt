package com.example.jazzgreatest

object LegendData {
    private val names = arrayOf(
        "Duke Ellington",
        "Thelonious Monk",
        "Miles Davis",
        "Billy Strayhorn",
        "Thad Jones",
        "Charles Mingus",
        "Bill Evans",
        "Count Basie",
        "Mary Lou Williams",
        "Chick Corea"
    )

    private val birthNames = arrayOf(
        "Edward Kennedy Ellington",
        "Thelonious Sphere Monk",
        "Miles Dewey Davis III",
        "William Thomas Strayhorn",
        "Thaddeus Joseph Jones",
        "Charles Mingus Jr.",
        "William John Evans",
        "William James Basie",
        "Mary Elfrieda Scruggs",
        "Armando Anthony Corea"
    )

    private val bornDates = arrayOf(
        "April 29, 1899",
        "October 10, 1917",
        "May 26, 1926",
        "November 29, 1915",
        "March 28, 1923",
        "April 22, 1922",
        "August 16, 1929",
        "August 21, 1904",
        "May 8, 1910",
        "June 12, 1941"
    )

    private val diedDates = arrayOf(
        "May 24, 1974",
        "February 17, 1982",
        "September 28, 1991",
        "May 31, 1967",
        "August 20, 1986",
        "January 5, 1979",
        "September 15, 1980",
        "April 26, 1984",
        "May 28, 1981",
        "February 9, 2021"
    )

    private val yearActive = arrayOf(
        "1914–1974",
        "1940–1973",
        "1944–1975",
        "1934–1964",
        "1954-1986",
        "1943–1979",
        "1950–1980",
        "1924–1984",
        "1920–1981",
        "1962–2021"
    )

    private val instruments = arrayOf(
        "Piano",
        "Piano",
        "Trumpet, Flugelhorn",
        "Piano",
        "Trumpet, Flugelhorn",
        "Double Bass, Piano",
        "Piano",
        "Piano, Organ",
        "Piano",
        "Piano, Keyboard",
    )

    private val popularSongs = arrayOf(
        "It Don't Mean a Thing",
        "Round Midnight",
        "In a Silent Way",
        "Take The A Train",
        "A Child is Born",
        "Good Bye Pork Pie Hat",
        "Waltz for Debby",
        "One O'Clock Jump",
        "Roll 'Em",
        "Spain"
    )

    private val summaries = arrayOf(
        "Duke Ellington was an American jazz composer, pianist, and bandleader who played a pivotal role in shaping the genre during the 20th century. He composed over 1,000 pieces of music and recorded extensively, including with his eponymous orchestra, which he led for over 50 years. Known for his innovative style, Ellington seamlessly blended different musical influences, from blues to classical, to create a unique sound that continues to influence musicians today.",
        "Thelonious Monk was an American jazz pianist and composer who was one of the pioneers of modern jazz. Known for his distinctive playing style and unconventional approach to harmony and rhythm, Monk was a highly influential figure in the development of bebop and other forms of modern jazz. He composed numerous classic jazz standards, including \"Round Midnight\" and \"Blue Monk,\" and his unique sound continues to inspire musicians today. Monk was also renowned for his idiosyncratic personality and fashion sense.",
        "Miles Davis was an American jazz trumpeter, bandleader, and composer who was one of the most influential figures in the history of jazz. Davis was at the forefront of several major developments in the genre, including bebop, cool jazz, and jazz fusion. He was known for his virtuosic playing style, innovative use of improvisation and his ability to assemble talented ensembles. Davis released numerous acclaimed albums throughout his career, including Kind of Blue, which is widely regarded as one of the greatest jazz albums of all time.",
        "Billy Strayhorn was an American jazz composer, pianist, and arranger who is best known for his close collaboration with Duke Ellington. Strayhorn wrote many of Ellington's most famous compositions, including \"Take the A Train,\" and was a key member of the Duke Ellington Orchestra. He was known for his sophisticated arrangements and unique harmonic sense, which helped to shape the sound of jazz during the mid-20th century. Despite his significant contributions to jazz, Strayhorn remains somewhat underappreciated in the wider world of music.",
        "Thad Jones was an American jazz trumpeter, composer, and bandleader who was a prominent figure in the jazz scene during the mid-20th century. Jones was known for his virtuosic trumpet playing and his innovative compositions, which often featured complex harmonies and rhythms. He led his own successful big band for many years and was also a prolific arranger for other musicians. Jones is widely regarded as one of the most important jazz musicians of his generation.",
        "Charles Mingus was an American jazz double bassist, composer, and bandleader who was one of the most influential figures in the history of jazz. Mingus was known for his virtuosic bass playing, his innovative compositions, and his strong social and political views, which often found expression in his music. He led several successful ensembles during his career and recorded numerous acclaimed albums, including The Black Saint and the Sinner Lady. Mingus is widely regarded as one of the greatest jazz musicians of all time.",
        "Bill Evans was an influential American jazz pianist and composer who played a significant role in the development of modern jazz piano. He was known for his unique playing style, characterized by a delicate touch, complex harmonies, and introspective sound. Evans collaborated with many acclaimed jazz musicians and recorded numerous successful albums, including \"Sunday at the Village Vanguard.\" His contributions to jazz have made him widely regarded as one of the most important jazz pianists of all time.",
        "Count Basie was a highly influential American jazz pianist, composer, and bandleader who played a major role in the swing era of jazz. He led a band that was known for its tight, rhythmic sound and its focus on improvisation rooted in the blues. Basie recorded numerous highly-regarded albums throughout his career, including \"One O'Clock Jump\" and \"April in Paris.\" He was also a mentor to many younger musicians, and his impact on jazz can be heard in the work of countless other artists who followed in his footsteps.",
        "Mary Lou Williams was an influential American jazz pianist, composer, and arranger who played a key role in the development of bebop and other modern jazz styles. Known for her exceptional piano skills and innovative compositions, Williams collaborated with many renowned jazz musicians and recorded numerous highly-regarded albums, such as \"Zodiac Suite.\" Additionally, she served as an important mentor and teacher to other musicians, particularly women, and played an instrumental role in shaping the jazz scene of her time.",
        "Chick Corea was an American jazz pianist, composer, and bandleader who was one of the most influential figures in the development of jazz fusion during the late 20th century. Corea was known for his virtuosic keyboard playing, his innovative compositions that blended elements of jazz, rock, and classical music, and his leadership of several successful ensembles. He recorded numerous acclaimed albums throughout his career, including \"Return to Forever,\" and won 23 Grammy awards. Corea passed away in 2021 but his legacy continues to inspire musicians worldwide."
    )

    private val photos = arrayOf(
        R.drawable.duke_ellington,
        R.drawable.thelonious_monk,
        R.drawable.miles_davies,
        R.drawable.billy_strayhorn,
        R.drawable.thad_jones,
        R.drawable.charles_mingus,
        R.drawable.bill_evans,
        R.drawable.count_basie,
        R.drawable.mary_lou,
        R.drawable.chick_corea
    )

    val listLegend: ArrayList<Legend>
        get() {
            val list = arrayListOf<Legend>()

            for (pos in names.indices) {
                val name = names[pos]
                val birthName = birthNames[pos]
                val born = bornDates[pos]
                val died = diedDates[pos]
                val yearsActive = yearActive[pos]
                val instrument = instruments[pos]
                val popularSong = popularSongs[pos]
                val summary = summaries[pos]
                val photo = photos[pos]

                val legend = Legend(
                    name,
                    birthName,
                    born,
                    died,
                    yearsActive,
                    instrument,
                    popularSong,
                    summary,
                    photo
                )

                list.add(legend)
            }

            return list
        }
}
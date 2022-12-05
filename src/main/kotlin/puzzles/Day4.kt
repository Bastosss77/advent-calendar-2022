package puzzles

fun day4() {
    var overlap = 0
    var overlapAtAll = 0

    input
        .reader()
        .readLines()
        .forEach { pairs ->
            val (first, second) = pairs.split(',').let {
                (it[0].split("-")) to (it[1].split("-"))
            }

            val firstRange = IntRange(first[0].toInt(), first[1].toInt())
            val secondRange = IntRange(second[0].toInt(), second[1].toInt())

            if((firstRange.contains(secondRange.first) || firstRange.contains(secondRange.last))
                || (secondRange.contains(firstRange.first) || secondRange.contains(firstRange.last))) {
                overlapAtAll += 1
            }

            if((firstRange.first <= secondRange.first && firstRange.last >= secondRange.last)
                || (secondRange.first <= firstRange.first && secondRange.last >= firstRange.last)) {
                overlap += 1
            }
        }

    println("December 4th (Part 1) : $overlap")
    println("December 4th (Part 2) : $overlapAtAll")
}

private val testInput = """
    2-4,6-8
    2-3,4-5
    5-7,7-9
    2-8,3-7
    6-6,4-6
    2-6,4-8
""".trimIndent()

private val input = """
    8-13,10-65
    13-23,14-24
    72-83,73-76
    37-37,39-73
    64-94,65-65
    2-2,10-65
    53-57,24-54
    34-87,34-88
    4-95,3-96
    69-69,68-68
    2-2,1-66
    17-78,16-78
    50-59,30-58
    29-84,29-85
    82-91,81-82
    50-55,41-48
    1-89,7-88
    11-80,11-79
    81-83,61-83
    68-71,68-70
    42-83,23-83
    78-86,78-86
    5-85,2-5
    47-65,7-47
    8-99,8-98
    7-64,7-79
    1-3,3-79
    10-18,10-19
    49-69,69-78
    1-98,2-98
    11-19,10-99
    6-97,5-98
    73-74,32-73
    96-97,1-97
    4-6,8-88
    23-28,21-29
    26-36,21-25
    59-77,58-93
    29-74,30-73
    1-85,85-99
    47-48,47-85
    42-51,17-52
    43-44,44-44
    5-30,38-66
    47-61,62-73
    27-52,26-51
    11-96,95-99
    74-82,73-82
    8-8,7-93
    81-81,14-81
    25-77,26-76
    21-81,22-80
    2-94,3-94
    16-91,17-90
    95-96,3-96
    25-28,36-97
    28-90,28-90
    10-88,5-89
    45-47,4-45
    6-58,9-62
    97-98,32-96
    79-85,60-85
    32-96,5-8
    12-64,12-12
    72-85,37-72
    5-98,4-6
    95-96,3-95
    49-82,1-82
    31-49,31-50
    58-65,56-57
    37-58,8-37
    10-29,9-96
    85-92,79-85
    71-84,40-84
    37-50,36-51
    37-52,37-52
    21-98,20-85
    4-99,4-98
    78-84,77-99
    16-50,50-90
    4-34,35-42
    75-79,13-76
    45-55,49-84
    76-97,1-77
    17-45,9-16
    1-9,1-4
    13-35,13-35
    4-68,68-76
    14-76,21-76
    58-71,58-72
    12-34,34-35
    35-93,35-94
    18-36,10-36
    10-88,11-77
    8-86,8-85
    10-33,34-34
    1-97,3-96
    50-92,1-49
    2-4,4-99
    2-88,54-88
    1-95,2-78
    3-50,2-69
    44-48,43-99
    7-78,2-2
    74-74,3-73
    70-71,45-70
    13-97,8-14
    56-75,57-57
    5-93,5-83
    47-48,46-49
    73-80,73-80
    4-47,5-47
    69-94,68-93
    15-84,16-84
    63-64,9-64
    69-79,60-68
    32-79,5-78
    54-99,55-92
    40-41,40-75
    30-97,97-99
    28-28,28-98
    4-81,23-80
    28-45,29-94
    20-21,21-53
    52-52,27-51
    88-94,47-95
    88-89,33-89
    15-62,16-66
    1-24,23-32
    4-31,6-92
    7-13,14-99
    6-61,7-61
    26-51,24-51
    6-52,25-51
    29-49,49-50
    36-36,37-69
    7-95,94-95
    17-81,80-98
    11-63,63-63
    13-84,14-46
    26-32,12-26
    60-85,61-63
    65-71,39-68
    44-94,44-88
    64-84,84-97
    12-92,13-92
    49-89,50-50
    54-98,98-99
    20-88,15-87
    39-64,47-63
    4-79,3-80
    1-18,1-18
    17-49,16-49
    40-70,39-99
    46-48,13-47
    21-88,22-98
    6-94,1-5
    63-97,96-99
    13-58,11-13
    3-95,3-96
    19-85,18-88
    42-52,42-53
    2-63,63-96
    4-93,35-92
    9-89,89-92
    3-61,3-61
    6-93,5-94
    14-98,14-98
    4-99,3-5
    27-28,28-55
    22-92,91-99
    2-56,55-56
    22-22,21-22
    82-95,23-96
    31-32,31-62
    29-54,29-62
    12-98,16-95
    73-90,31-73
    20-83,17-83
    4-93,5-94
    5-41,39-69
    7-51,6-26
    83-95,83-94
    23-91,24-92
    31-39,7-30
    10-10,9-87
    52-60,59-94
    6-92,5-88
    58-74,56-57
    21-98,22-99
    91-98,31-92
    87-87,22-58
    34-45,34-44
    29-96,28-95
    54-97,16-55
    9-78,1-8
    19-96,96-99
    15-94,94-94
    31-80,28-42
    2-44,4-98
    29-29,31-80
    15-96,15-96
    2-72,72-73
    6-98,98-98
    14-76,46-77
    22-90,22-69
    38-94,93-94
    24-78,23-78
    59-97,71-98
    3-17,18-70
    62-98,63-98
    75-76,12-76
    16-71,17-70
    16-17,16-17
    23-69,24-68
    64-76,3-65
    1-20,20-84
    23-23,22-66
    12-58,32-82
    89-95,23-88
    15-74,16-75
    36-37,7-36
    93-93,17-92
    19-49,18-48
    35-38,34-54
    22-33,11-22
    53-98,52-97
    23-65,23-96
    70-93,56-69
    40-84,40-84
    9-91,10-90
    16-89,16-89
    27-74,73-96
    3-98,4-95
    20-73,20-73
    71-97,20-98
    15-40,16-16
    8-85,84-93
    37-38,38-38
    14-25,14-24
    9-56,8-56
    6-68,6-69
    33-78,5-45
    83-83,16-83
    56-97,56-98
    82-97,2-98
    3-35,24-95
    3-33,4-34
    54-93,55-92
    7-92,29-91
    39-79,40-78
    16-69,16-69
    5-23,5-69
    88-98,30-88
    80-81,81-97
    92-96,30-93
    17-90,17-90
    11-12,11-28
    3-99,3-99
    10-55,53-75
    18-64,17-78
    31-56,56-57
    41-72,40-72
    4-98,3-97
    10-99,2-10
    53-71,71-72
    9-88,7-85
    41-92,42-42
    15-51,14-50
    34-63,33-90
    6-7,9-63
    44-84,31-45
    14-92,81-92
    32-87,32-87
    4-4,7-65
    21-22,22-42
    9-28,13-27
    1-69,2-69
    10-38,11-38
    22-78,5-79
    15-93,16-95
    11-77,4-10
    96-97,16-97
    48-54,47-55
    51-59,40-59
    13-53,13-53
    34-54,53-95
    67-98,97-97
    30-96,31-96
    11-98,10-99
    52-90,53-91
    2-4,3-71
    48-99,48-94
    14-96,15-95
    94-99,11-95
    53-91,54-91
    20-58,58-58
    6-88,87-91
    49-72,25-73
    18-90,8-44
    17-95,92-95
    7-68,22-66
    22-57,22-56
    40-40,39-52
    9-80,8-79
    19-94,20-95
    26-90,25-55
    38-38,37-99
    1-97,2-97
    40-67,41-67
    5-91,91-95
    2-79,79-80
    93-98,4-94
    4-14,15-15
    66-77,42-66
    35-71,53-73
    79-88,7-78
    4-85,5-86
    3-59,2-58
    54-90,19-91
    11-13,12-99
    18-51,50-99
    44-88,88-97
    8-93,7-97
    8-32,7-51
    4-67,50-66
    10-15,15-79
    3-58,5-58
    85-99,72-97
    17-98,17-98
    15-54,16-43
    49-58,37-50
    3-40,40-41
    17-30,30-30
    2-99,4-99
    12-74,4-11
    13-83,84-93
    43-87,76-88
    32-92,31-92
    86-94,2-87
    42-53,53-84
    7-91,8-91
    3-73,54-78
    2-14,16-84
    2-52,1-96
    57-76,56-76
    88-89,8-89
    8-88,7-88
    19-87,11-87
    50-92,50-96
    36-46,36-46
    48-79,48-78
    28-69,13-20
    3-8,7-91
    30-32,31-47
    32-80,33-50
    39-64,40-63
    18-94,7-19
    9-30,8-31
    33-87,34-39
    43-84,83-85
    23-70,22-69
    13-80,12-80
    15-51,14-53
    2-59,2-60
    12-94,11-75
    34-62,35-62
    12-14,13-31
    17-21,21-83
    17-27,27-68
    65-83,66-82
    22-36,23-34
    44-82,23-45
    13-32,3-15
    39-50,40-50
    2-4,3-82
    17-51,16-50
    53-69,52-78
    19-27,18-77
    59-86,2-96
    67-67,15-63
    29-29,28-61
    13-98,12-98
    39-86,39-87
    14-39,13-34
    21-63,22-64
    16-27,45-65
    28-97,27-57
    11-87,10-60
    13-57,57-57
    2-8,1-9
    1-95,2-95
    16-16,15-98
    49-76,76-88
    42-71,41-72
    45-89,19-46
    8-88,3-9
    11-84,10-85
    4-86,6-98
    52-72,51-52
    12-12,11-22
    12-97,13-96
    3-86,87-87
    1-30,3-98
    29-56,30-57
    12-97,12-93
    10-84,84-84
    39-74,39-86
    37-99,25-99
    70-90,69-91
    30-68,29-99
    6-31,70-89
    13-76,10-13
    9-73,19-62
    96-98,37-96
    11-87,11-87
    50-83,50-85
    20-74,74-74
    47-90,46-85
    67-73,68-82
    1-80,81-81
    3-34,34-38
    2-2,1-84
    42-46,43-46
    12-93,12-94
    10-39,40-98
    5-77,40-84
    2-97,3-97
    6-45,3-46
    38-40,39-66
    53-67,52-68
    39-39,38-69
    3-55,2-71
    6-74,74-74
    12-97,12-75
    24-55,25-56
    6-6,5-22
    24-87,73-86
    14-84,15-83
    16-87,88-91
    89-90,66-89
    7-25,26-65
    15-31,32-97
    52-79,53-82
    50-89,49-51
    71-72,15-72
    3-5,4-74
    14-92,15-93
    29-42,42-79
    21-63,21-64
    6-23,5-86
    8-99,9-97
    3-61,3-62
    98-98,18-99
    10-40,9-39
    61-75,62-62
    12-98,46-98
    15-68,16-69
    27-94,26-93
    3-8,8-71
    10-63,62-87
    14-14,13-72
    47-76,47-76
    36-72,15-47
    9-97,11-96
    80-81,42-81
    32-89,1-73
    1-5,4-95
    3-9,9-85
    1-64,4-64
    42-60,42-60
    89-94,88-89
    27-83,28-84
    34-75,35-35
    73-98,43-74
    41-63,64-96
    47-92,20-29
    19-97,18-20
    63-87,64-76
    7-99,5-79
    5-7,6-67
    98-99,5-99
    71-83,71-84
    69-91,69-91
    33-33,32-97
    78-78,23-78
    74-99,54-87
    2-99,3-99
    13-64,14-65
    14-76,2-13
    53-89,53-89
    3-86,5-74
    30-98,29-30
    93-94,27-94
    1-59,58-59
    9-36,9-47
    2-99,75-98
    57-65,57-66
    17-41,17-99
    16-71,21-93
    8-32,17-48
    78-78,1-77
    1-32,31-32
    2-96,1-96
    18-45,23-43
    3-90,4-90
    19-35,20-45
    29-76,75-93
    38-55,19-39
    26-85,26-86
    42-90,41-90
    2-72,72-93
    81-89,23-81
    8-72,7-9
    28-41,37-40
    28-56,29-55
    9-39,8-38
    56-59,58-87
    13-99,14-99
    44-90,43-91
    76-85,84-86
    95-99,15-99
    12-96,23-95
    45-48,48-48
    7-49,1-3
    36-76,35-50
    10-36,35-62
    86-92,10-87
    7-85,7-85
    50-50,49-50
    2-97,96-97
    23-42,43-87
    98-99,55-99
    6-96,7-58
    15-68,68-95
    48-66,47-66
    24-30,23-31
    32-63,9-23
    28-55,54-56
    66-78,67-79
    14-95,14-95
    3-57,9-57
    88-90,87-98
    53-98,52-54
    8-99,4-9
    23-79,23-80
    12-86,11-87
    56-62,56-63
    8-88,52-87
    58-92,59-75
    46-72,71-72
    1-10,9-95
    58-58,20-59
    12-99,11-98
    36-61,61-68
    51-57,69-87
    4-99,5-83
    33-93,33-94
    12-35,29-34
    23-46,24-46
    81-96,81-95
    24-39,40-86
    2-6,28-93
    7-16,15-43
    10-65,2-66
    9-27,10-28
    47-71,55-61
    12-65,13-64
    93-94,19-93
    14-92,10-11
    8-70,9-69
    4-98,3-98
    21-79,22-79
    14-94,15-84
    13-45,14-45
    45-73,46-72
    18-32,17-31
    26-26,26-26
    12-88,11-13
    15-38,12-15
    19-19,18-90
    38-98,39-93
    20-22,19-68
    4-76,3-76
    58-97,99-99
    78-91,1-79
    8-8,8-43
    6-81,7-76
    15-95,16-94
    6-80,5-81
    16-50,15-16
    21-23,23-74
    20-92,91-92
    6-76,5-76
    33-73,73-97
    40-69,28-87
    8-26,25-98
    14-95,13-95
    15-15,14-52
    14-84,1-40
    2-97,3-3
    19-64,25-63
    4-54,5-54
    18-66,17-74
    76-78,76-79
    4-82,5-82
    6-12,12-93
    60-60,59-60
    23-67,23-68
    19-64,19-63
    53-75,48-70
    46-81,45-47
    1-21,1-2
    81-98,31-82
    41-74,40-73
    5-97,96-98
    7-84,6-83
    4-52,1-3
    51-66,64-81
    56-83,35-56
    55-68,48-56
    15-18,14-88
    14-93,14-94
    50-73,65-89
    3-93,2-79
    58-77,27-43
    3-51,4-52
    14-81,14-80
    2-58,14-90
    19-62,20-63
    1-6,5-21
    10-74,4-92
    38-44,39-44
    5-12,13-97
    39-70,32-69
    43-72,29-43
    42-42,43-50
    1-32,29-58
    22-67,21-70
    12-12,12-98
    58-90,42-56
    97-99,11-97
    78-78,38-78
    73-95,69-74
    92-97,55-93
    86-86,84-86
    25-25,24-25
    90-91,33-90
    2-93,3-93
    15-58,11-58
    41-95,94-99
    1-93,17-94
    22-64,22-64
    18-93,19-94
    25-95,24-26
    40-91,39-91
    18-46,17-45
    2-82,1-74
    24-41,23-24
    92-93,58-93
    37-46,38-46
    30-46,30-30
    2-17,9-96
    9-98,2-99
    92-92,11-92
    21-27,26-28
    4-79,5-79
    76-86,77-85
    9-96,2-96
    4-78,78-78
    12-97,12-99
    54-73,55-72
    68-81,21-67
    32-86,16-30
    62-95,61-96
    56-87,55-86
    96-97,26-96
    28-39,38-83
    18-64,64-82
    26-37,6-21
    41-76,40-89
    24-56,23-55
    49-96,97-99
    31-31,30-89
    15-17,11-18
    45-88,54-90
    5-39,13-97
    10-97,92-97
    24-73,46-63
    2-83,10-84
    13-73,12-72
    41-89,40-90
    15-91,90-94
    5-87,1-5
    16-19,17-18
    59-61,10-59
    84-89,27-83
    34-98,10-33
    45-93,45-94
    14-28,14-29
    3-88,87-87
    43-85,85-96
    4-96,1-4
    22-45,45-78
    82-82,27-83
    89-90,27-90
    15-94,93-94
    76-76,77-77
    97-99,2-98
    13-95,94-95
    8-11,7-40
    10-91,11-91
    11-60,60-60
    64-92,2-92
    75-90,65-75
    11-97,11-97
    4-4,5-96
    77-97,78-97
    32-86,20-86
    17-30,3-17
    11-87,11-87
    4-78,4-79
    10-72,73-73
    18-34,4-34
    17-56,16-18
    11-98,11-98
    19-88,18-87
    70-84,15-69
    1-67,2-67
    32-39,21-32
    64-97,28-64
    8-77,94-99
    6-12,12-98
    11-90,10-11
    45-45,44-45
    40-90,40-90
    3-91,2-4
    20-76,20-76
    29-30,30-33
    98-98,58-97
    51-98,50-99
    53-66,36-52
    65-91,65-92
    47-98,46-99
    35-56,36-40
    8-93,1-9
    60-62,31-61
    33-44,52-72
    76-95,94-95
    54-80,55-55
    1-98,2-98
    16-17,22-59
    18-89,19-90
    2-2,1-88
    5-62,5-62
    12-53,13-53
    22-42,21-75
    28-83,83-94
    3-96,4-98
    13-29,30-30
    3-96,1-96
    54-54,43-55
    14-29,29-30
    11-91,12-92
    9-89,8-88
    38-50,56-87
    10-14,19-79
    40-40,40-78
    18-52,17-60
    15-85,16-16
    4-90,4-91
    26-29,29-86
    97-99,68-96
    9-9,8-39
    41-51,33-33
    3-50,4-49
    1-98,1-98
    68-91,69-92
    66-80,67-78
    12-38,37-38
    58-80,31-58
    23-58,23-58
    4-6,5-67
    27-49,26-50
    84-84,33-84
    72-73,11-73
    34-82,22-26
    20-84,84-84
    27-72,71-84
    20-54,54-76
    16-73,13-45
    14-64,1-10
    33-80,32-55
    16-86,17-45
    17-17,16-74
    8-97,8-33
    27-43,28-44
    16-47,48-70
    54-83,53-55
    26-80,27-81
    17-40,16-75
    21-79,21-80
    2-26,3-27
    3-99,2-36
    1-77,77-87
    51-82,50-90
    4-71,18-70
    17-17,16-18
    68-68,67-84
    2-2,1-93
    2-92,9-91
    2-17,1-3
    2-98,7-97
    2-94,1-94
    8-10,9-99
    50-66,49-96
    30-54,53-72
    46-99,18-84
    6-58,1-45
    4-91,3-94
    12-27,13-28
    17-95,10-57
    16-63,16-63
    25-95,95-99
    66-90,67-82
    4-96,1-3
    50-50,1-49
    93-98,6-94
    5-82,5-82
    3-96,95-99
    7-33,6-32
    23-42,43-77
    23-51,51-66
    76-78,77-93
    14-87,87-88
    23-41,43-52
    88-88,60-87
    92-96,92-98
    14-87,14-93
    85-92,5-86
    2-99,1-98
    23-74,23-75
    60-82,60-82
    22-82,22-91
    82-97,58-82
    1-50,1-50
    27-50,26-51
    65-95,64-96
    17-68,4-16
    9-95,4-7
    21-91,73-92
    2-21,3-3
    16-16,15-17
    20-55,26-59
    17-99,18-58
    9-88,8-88
    3-53,4-23
    5-85,4-95
    10-90,59-90
    55-80,3-56
    25-74,26-73
    20-75,19-75
    22-53,21-47
    2-86,5-98
    11-76,11-76
    26-33,45-70
    20-57,21-21
    80-91,72-73
    21-79,20-96
    10-69,25-84
    32-99,81-99
    46-72,45-73
    24-24,23-71
    27-27,26-91
    6-37,6-36
    41-83,40-42
    8-26,1-5
    29-96,32-79
    57-88,58-87
    1-97,96-97
    28-80,2-28
    22-43,22-43
    28-68,12-33
    12-15,3-5
    8-63,7-92
    64-97,26-97
    78-84,82-83
    29-38,29-37
    18-57,19-41
    11-78,1-11
    11-61,10-60
    72-84,77-84
    55-69,51-54
    2-60,2-61
    36-75,5-76
    3-99,98-99
    1-99,1-99
    91-93,75-91
    8-54,6-8
    11-32,33-93
    44-87,1-87
    23-52,9-52
    42-75,10-69
    7-96,7-90
    22-90,22-89
    31-96,30-95
    30-68,31-68
    29-74,2-7
    66-79,65-80
    41-87,41-86
    19-99,22-89
    7-7,6-97
    73-73,72-73
    26-75,25-75
    9-30,15-38
    48-77,70-76
    81-91,64-91
    30-32,31-45
    40-73,40-59
    20-95,19-95
    55-86,38-54
    6-73,72-73
    4-94,5-93
    9-82,8-82
    14-81,13-81
    31-66,66-71
    35-44,35-44
    8-9,8-32
    37-73,74-87
    27-48,26-59
    11-40,12-41
    26-94,26-93
    64-93,65-92
    31-79,61-80
    3-5,4-97
    13-38,39-47
    92-98,4-93
    88-96,13-89
    11-52,10-53
    32-73,33-72
    16-18,18-18
    3-46,1-3
    1-75,76-81
    2-48,3-49
    40-43,43-61
    1-97,3-97
    7-96,7-96
    31-68,32-67
    40-40,41-56
    22-61,36-60
    5-89,89-96
    83-84,17-84
    16-35,34-59
    10-86,11-95
    97-98,1-97
    25-93,22-94
    47-99,47-90
    65-65,9-64
    2-43,8-74
    92-95,12-93
    57-92,58-91
    6-63,63-64
    44-63,45-62
    46-60,47-61
    41-47,6-56
    61-96,59-59
    90-91,23-90
    58-77,57-78
    3-50,3-51
    57-88,58-88
    3-5,4-83
    56-86,55-57
    10-43,23-29
    32-81,9-32
    12-76,76-77
    2-92,1-98
    18-90,89-89
    54-89,3-6
    7-96,8-95
    43-72,72-97
    3-84,4-83
    21-98,22-99
    15-18,10-19
    5-5,5-94
    24-93,25-93
    55-74,74-82
    22-92,23-93
    25-33,34-34
    3-20,2-30
    15-34,20-42
    16-61,60-61
    10-16,9-15
    43-81,10-86
    28-35,27-30
    20-60,19-72
    49-51,50-55
    7-20,20-60
    19-99,20-98
    83-97,45-82
    14-65,13-64
""".trimIndent()
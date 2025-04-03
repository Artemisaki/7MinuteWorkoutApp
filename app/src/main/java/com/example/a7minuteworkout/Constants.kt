package com.example.a7minuteworkout

object Constants {

    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()

        val exercise1 = ExerciseModel(
            1,
            "Side Lunge",
            R.drawable.exercise1,
            false,
            false
        )

        val exercise2 = ExerciseModel(
            2,
            "Lunge",
            R.drawable.exercise2,
            false,
            false
        )

        val exercise3 = ExerciseModel(
            3,
            "Sumo Squat",
            R.drawable.exercise3,
            false,
            false
        )

        val exercise4 = ExerciseModel(
            4,
            "Elbow Plunk",
            R.drawable.exercise4,
            false,
            false
        )
        val exercise5 = ExerciseModel(
            5,
            "Knee Touch",
            R.drawable.exercise5,
            false,
            false
        )
        val exercise6 = ExerciseModel(
            6,
            "Russian Twist",
            R.drawable.exercise6,
            false,
            false
        )
        val exercise7 = ExerciseModel(
            7,
            "Crunch Clap",
            R.drawable.exercise7,
            false,
            false
        )
        exerciseList.add(exercise1)
        exerciseList.add(exercise2)
        exerciseList.add(exercise3)
        exerciseList.add(exercise4)
        exerciseList.add(exercise5)
        exerciseList.add(exercise6)
        exerciseList.add(exercise7)
        return exerciseList
    }
}
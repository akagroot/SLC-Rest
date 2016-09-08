/**
 * This class is generated by jOOQ
 */
package com.performancecarerx.persistence;


import com.performancecarerx.persistence.tables.ExerciseGoals;
import com.performancecarerx.persistence.tables.ExerciseGroups;
import com.performancecarerx.persistence.tables.Exercises;
import com.performancecarerx.persistence.tables.ExercisesRecorded;
import com.performancecarerx.persistence.tables.RatioProfileValues;
import com.performancecarerx.persistence.tables.RatioProfiles;
import com.performancecarerx.persistence.tables.Roles;
import com.performancecarerx.persistence.tables.Users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 180890672;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.exercise_goals</code>.
     */
    public final ExerciseGoals EXERCISE_GOALS = com.performancecarerx.persistence.tables.ExerciseGoals.EXERCISE_GOALS;

    /**
     * The table <code>public.exercise_groups</code>.
     */
    public final ExerciseGroups EXERCISE_GROUPS = com.performancecarerx.persistence.tables.ExerciseGroups.EXERCISE_GROUPS;

    /**
     * The table <code>public.exercises</code>.
     */
    public final Exercises EXERCISES = com.performancecarerx.persistence.tables.Exercises.EXERCISES;

    /**
     * The table <code>public.exercises_recorded</code>.
     */
    public final ExercisesRecorded EXERCISES_RECORDED = com.performancecarerx.persistence.tables.ExercisesRecorded.EXERCISES_RECORDED;

    /**
     * The table <code>public.ratio_profile_values</code>.
     */
    public final RatioProfileValues RATIO_PROFILE_VALUES = com.performancecarerx.persistence.tables.RatioProfileValues.RATIO_PROFILE_VALUES;

    /**
     * The table <code>public.ratio_profiles</code>.
     */
    public final RatioProfiles RATIO_PROFILES = com.performancecarerx.persistence.tables.RatioProfiles.RATIO_PROFILES;

    /**
     * The table <code>public.roles</code>.
     */
    public final Roles ROLES = com.performancecarerx.persistence.tables.Roles.ROLES;

    /**
     * The table <code>public.users</code>.
     */
    public final Users USERS = com.performancecarerx.persistence.tables.Users.USERS;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.EXERCISE_GOALS_ID_SEQ,
            Sequences.EXERCISES_ID_SEQ,
            Sequences.EXERCISES_RECORDED_ID_SEQ,
            Sequences.RATIO_PROFILE_VALUES_ID_SEQ,
            Sequences.RATIO_PROFILES_ID_SEQ,
            Sequences.USERS_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            ExerciseGoals.EXERCISE_GOALS,
            ExerciseGroups.EXERCISE_GROUPS,
            Exercises.EXERCISES,
            ExercisesRecorded.EXERCISES_RECORDED,
            RatioProfileValues.RATIO_PROFILE_VALUES,
            RatioProfiles.RATIO_PROFILES,
            Roles.ROLES,
            Users.USERS);
    }
}
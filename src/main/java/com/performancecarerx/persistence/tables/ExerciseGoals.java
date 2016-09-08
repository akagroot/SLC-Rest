/**
 * This class is generated by jOOQ
 */
package com.performancecarerx.persistence.tables;


import com.performancecarerx.persistence.Keys;
import com.performancecarerx.persistence.Public;
import com.performancecarerx.persistence.tables.records.ExerciseGoalsRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class ExerciseGoals extends TableImpl<ExerciseGoalsRecord> {

    private static final long serialVersionUID = 1143306176;

    /**
     * The reference instance of <code>public.exercise_goals</code>
     */
    public static final ExerciseGoals EXERCISE_GOALS = new ExerciseGoals();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ExerciseGoalsRecord> getRecordType() {
        return ExerciseGoalsRecord.class;
    }

    /**
     * The column <code>public.exercise_goals.id</code>.
     */
    public final TableField<ExerciseGoalsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('exercise_goals_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.exercise_goals.exercise_id</code>.
     */
    public final TableField<ExerciseGoalsRecord, Integer> EXERCISE_ID = createField("exercise_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.exercise_goals.weight</code>.
     */
    public final TableField<ExerciseGoalsRecord, Integer> WEIGHT = createField("weight", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.exercise_goals.reps</code>.
     */
    public final TableField<ExerciseGoalsRecord, Integer> REPS = createField("reps", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.exercise_goals.user_id</code>.
     */
    public final TableField<ExerciseGoalsRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.exercise_goals.created_on_dttm</code>.
     */
    public final TableField<ExerciseGoalsRecord, Timestamp> CREATED_ON_DTTM = createField("created_on_dttm", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>public.exercise_goals</code> table reference
     */
    public ExerciseGoals() {
        this("exercise_goals", null);
    }

    /**
     * Create an aliased <code>public.exercise_goals</code> table reference
     */
    public ExerciseGoals(String alias) {
        this(alias, EXERCISE_GOALS);
    }

    private ExerciseGoals(String alias, Table<ExerciseGoalsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ExerciseGoals(String alias, Table<ExerciseGoalsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ExerciseGoalsRecord, Long> getIdentity() {
        return Keys.IDENTITY_EXERCISE_GOALS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ExerciseGoalsRecord> getPrimaryKey() {
        return Keys.EXERCISE_GOALS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ExerciseGoalsRecord>> getKeys() {
        return Arrays.<UniqueKey<ExerciseGoalsRecord>>asList(Keys.EXERCISE_GOALS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ExerciseGoalsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ExerciseGoalsRecord, ?>>asList(Keys.EXERCISE_GOALS__FK_EXERCISE_GOALS_EXERCISE_IDX, Keys.EXERCISE_GOALS__FK_EXERCISE_GOALS_USER_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExerciseGoals as(String alias) {
        return new ExerciseGoals(alias, this);
    }

    /**
     * Rename this table
     */
    public ExerciseGoals rename(String name) {
        return new ExerciseGoals(name, null);
    }
}

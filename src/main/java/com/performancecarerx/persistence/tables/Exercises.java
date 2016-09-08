/**
 * This class is generated by jOOQ
 */
package com.performancecarerx.persistence.tables;


import com.performancecarerx.persistence.Keys;
import com.performancecarerx.persistence.Public;
import com.performancecarerx.persistence.tables.records.ExercisesRecord;

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
public class Exercises extends TableImpl<ExercisesRecord> {

    private static final long serialVersionUID = -1227653425;

    /**
     * The reference instance of <code>public.exercises</code>
     */
    public static final Exercises EXERCISES = new Exercises();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ExercisesRecord> getRecordType() {
        return ExercisesRecord.class;
    }

    /**
     * The column <code>public.exercises.id</code>.
     */
    public final TableField<ExercisesRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('exercises_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.exercises.name</code>.
     */
    public final TableField<ExercisesRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.exercises.exercise_group_key_name</code>.
     */
    public final TableField<ExercisesRecord, String> EXERCISE_GROUP_KEY_NAME = createField("exercise_group_key_name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.exercises.is_deleted</code>.
     */
    public final TableField<ExercisesRecord, Boolean> IS_DELETED = createField("is_deleted", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.exercises.ratio_profile_id</code>.
     */
    public final TableField<ExercisesRecord, Integer> RATIO_PROFILE_ID = createField("ratio_profile_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.exercises</code> table reference
     */
    public Exercises() {
        this("exercises", null);
    }

    /**
     * Create an aliased <code>public.exercises</code> table reference
     */
    public Exercises(String alias) {
        this(alias, EXERCISES);
    }

    private Exercises(String alias, Table<ExercisesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Exercises(String alias, Table<ExercisesRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ExercisesRecord, Long> getIdentity() {
        return Keys.IDENTITY_EXERCISES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ExercisesRecord> getPrimaryKey() {
        return Keys.EXERCISES_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ExercisesRecord>> getKeys() {
        return Arrays.<UniqueKey<ExercisesRecord>>asList(Keys.EXERCISES_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ExercisesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ExercisesRecord, ?>>asList(Keys.EXERCISES__FK_EXERCISES_EXERCISE_GROUP_KEY_NAME_IDX, Keys.EXERCISES__FK_EXERCISES_RATIO_PROFILE_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Exercises as(String alias) {
        return new Exercises(alias, this);
    }

    /**
     * Rename this table
     */
    public Exercises rename(String name) {
        return new Exercises(name, null);
    }
}

package com.vip.video.repository.entity;

import java.util.ArrayList;
import java.util.List;

public class BallExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BallExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNo1IsNull() {
            addCriterion("no1 is null");
            return (Criteria) this;
        }

        public Criteria andNo1IsNotNull() {
            addCriterion("no1 is not null");
            return (Criteria) this;
        }

        public Criteria andNo1EqualTo(String value) {
            addCriterion("no1 =", value, "no1");
            return (Criteria) this;
        }

        public Criteria andNo1NotEqualTo(String value) {
            addCriterion("no1 <>", value, "no1");
            return (Criteria) this;
        }

        public Criteria andNo1GreaterThan(String value) {
            addCriterion("no1 >", value, "no1");
            return (Criteria) this;
        }

        public Criteria andNo1GreaterThanOrEqualTo(String value) {
            addCriterion("no1 >=", value, "no1");
            return (Criteria) this;
        }

        public Criteria andNo1LessThan(String value) {
            addCriterion("no1 <", value, "no1");
            return (Criteria) this;
        }

        public Criteria andNo1LessThanOrEqualTo(String value) {
            addCriterion("no1 <=", value, "no1");
            return (Criteria) this;
        }

        public Criteria andNo1Like(String value) {
            addCriterion("no1 like", value, "no1");
            return (Criteria) this;
        }

        public Criteria andNo1NotLike(String value) {
            addCriterion("no1 not like", value, "no1");
            return (Criteria) this;
        }

        public Criteria andNo1In(List<String> values) {
            addCriterion("no1 in", values, "no1");
            return (Criteria) this;
        }

        public Criteria andNo1NotIn(List<String> values) {
            addCriterion("no1 not in", values, "no1");
            return (Criteria) this;
        }

        public Criteria andNo1Between(String value1, String value2) {
            addCriterion("no1 between", value1, value2, "no1");
            return (Criteria) this;
        }

        public Criteria andNo1NotBetween(String value1, String value2) {
            addCriterion("no1 not between", value1, value2, "no1");
            return (Criteria) this;
        }

        public Criteria andNo2IsNull() {
            addCriterion("no2 is null");
            return (Criteria) this;
        }

        public Criteria andNo2IsNotNull() {
            addCriterion("no2 is not null");
            return (Criteria) this;
        }

        public Criteria andNo2EqualTo(String value) {
            addCriterion("no2 =", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2NotEqualTo(String value) {
            addCriterion("no2 <>", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2GreaterThan(String value) {
            addCriterion("no2 >", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2GreaterThanOrEqualTo(String value) {
            addCriterion("no2 >=", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2LessThan(String value) {
            addCriterion("no2 <", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2LessThanOrEqualTo(String value) {
            addCriterion("no2 <=", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2Like(String value) {
            addCriterion("no2 like", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2NotLike(String value) {
            addCriterion("no2 not like", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2In(List<String> values) {
            addCriterion("no2 in", values, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2NotIn(List<String> values) {
            addCriterion("no2 not in", values, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2Between(String value1, String value2) {
            addCriterion("no2 between", value1, value2, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2NotBetween(String value1, String value2) {
            addCriterion("no2 not between", value1, value2, "no2");
            return (Criteria) this;
        }

        public Criteria andNo3IsNull() {
            addCriterion("no3 is null");
            return (Criteria) this;
        }

        public Criteria andNo3IsNotNull() {
            addCriterion("no3 is not null");
            return (Criteria) this;
        }

        public Criteria andNo3EqualTo(String value) {
            addCriterion("no3 =", value, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3NotEqualTo(String value) {
            addCriterion("no3 <>", value, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3GreaterThan(String value) {
            addCriterion("no3 >", value, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3GreaterThanOrEqualTo(String value) {
            addCriterion("no3 >=", value, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3LessThan(String value) {
            addCriterion("no3 <", value, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3LessThanOrEqualTo(String value) {
            addCriterion("no3 <=", value, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3Like(String value) {
            addCriterion("no3 like", value, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3NotLike(String value) {
            addCriterion("no3 not like", value, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3In(List<String> values) {
            addCriterion("no3 in", values, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3NotIn(List<String> values) {
            addCriterion("no3 not in", values, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3Between(String value1, String value2) {
            addCriterion("no3 between", value1, value2, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3NotBetween(String value1, String value2) {
            addCriterion("no3 not between", value1, value2, "no3");
            return (Criteria) this;
        }

        public Criteria andNo4IsNull() {
            addCriterion("no4 is null");
            return (Criteria) this;
        }

        public Criteria andNo4IsNotNull() {
            addCriterion("no4 is not null");
            return (Criteria) this;
        }

        public Criteria andNo4EqualTo(String value) {
            addCriterion("no4 =", value, "no4");
            return (Criteria) this;
        }

        public Criteria andNo4NotEqualTo(String value) {
            addCriterion("no4 <>", value, "no4");
            return (Criteria) this;
        }

        public Criteria andNo4GreaterThan(String value) {
            addCriterion("no4 >", value, "no4");
            return (Criteria) this;
        }

        public Criteria andNo4GreaterThanOrEqualTo(String value) {
            addCriterion("no4 >=", value, "no4");
            return (Criteria) this;
        }

        public Criteria andNo4LessThan(String value) {
            addCriterion("no4 <", value, "no4");
            return (Criteria) this;
        }

        public Criteria andNo4LessThanOrEqualTo(String value) {
            addCriterion("no4 <=", value, "no4");
            return (Criteria) this;
        }

        public Criteria andNo4Like(String value) {
            addCriterion("no4 like", value, "no4");
            return (Criteria) this;
        }

        public Criteria andNo4NotLike(String value) {
            addCriterion("no4 not like", value, "no4");
            return (Criteria) this;
        }

        public Criteria andNo4In(List<String> values) {
            addCriterion("no4 in", values, "no4");
            return (Criteria) this;
        }

        public Criteria andNo4NotIn(List<String> values) {
            addCriterion("no4 not in", values, "no4");
            return (Criteria) this;
        }

        public Criteria andNo4Between(String value1, String value2) {
            addCriterion("no4 between", value1, value2, "no4");
            return (Criteria) this;
        }

        public Criteria andNo4NotBetween(String value1, String value2) {
            addCriterion("no4 not between", value1, value2, "no4");
            return (Criteria) this;
        }

        public Criteria andNo5IsNull() {
            addCriterion("no5 is null");
            return (Criteria) this;
        }

        public Criteria andNo5IsNotNull() {
            addCriterion("no5 is not null");
            return (Criteria) this;
        }

        public Criteria andNo5EqualTo(String value) {
            addCriterion("no5 =", value, "no5");
            return (Criteria) this;
        }

        public Criteria andNo5NotEqualTo(String value) {
            addCriterion("no5 <>", value, "no5");
            return (Criteria) this;
        }

        public Criteria andNo5GreaterThan(String value) {
            addCriterion("no5 >", value, "no5");
            return (Criteria) this;
        }

        public Criteria andNo5GreaterThanOrEqualTo(String value) {
            addCriterion("no5 >=", value, "no5");
            return (Criteria) this;
        }

        public Criteria andNo5LessThan(String value) {
            addCriterion("no5 <", value, "no5");
            return (Criteria) this;
        }

        public Criteria andNo5LessThanOrEqualTo(String value) {
            addCriterion("no5 <=", value, "no5");
            return (Criteria) this;
        }

        public Criteria andNo5Like(String value) {
            addCriterion("no5 like", value, "no5");
            return (Criteria) this;
        }

        public Criteria andNo5NotLike(String value) {
            addCriterion("no5 not like", value, "no5");
            return (Criteria) this;
        }

        public Criteria andNo5In(List<String> values) {
            addCriterion("no5 in", values, "no5");
            return (Criteria) this;
        }

        public Criteria andNo5NotIn(List<String> values) {
            addCriterion("no5 not in", values, "no5");
            return (Criteria) this;
        }

        public Criteria andNo5Between(String value1, String value2) {
            addCriterion("no5 between", value1, value2, "no5");
            return (Criteria) this;
        }

        public Criteria andNo5NotBetween(String value1, String value2) {
            addCriterion("no5 not between", value1, value2, "no5");
            return (Criteria) this;
        }

        public Criteria andNo6IsNull() {
            addCriterion("no6 is null");
            return (Criteria) this;
        }

        public Criteria andNo6IsNotNull() {
            addCriterion("no6 is not null");
            return (Criteria) this;
        }

        public Criteria andNo6EqualTo(String value) {
            addCriterion("no6 =", value, "no6");
            return (Criteria) this;
        }

        public Criteria andNo6NotEqualTo(String value) {
            addCriterion("no6 <>", value, "no6");
            return (Criteria) this;
        }

        public Criteria andNo6GreaterThan(String value) {
            addCriterion("no6 >", value, "no6");
            return (Criteria) this;
        }

        public Criteria andNo6GreaterThanOrEqualTo(String value) {
            addCriterion("no6 >=", value, "no6");
            return (Criteria) this;
        }

        public Criteria andNo6LessThan(String value) {
            addCriterion("no6 <", value, "no6");
            return (Criteria) this;
        }

        public Criteria andNo6LessThanOrEqualTo(String value) {
            addCriterion("no6 <=", value, "no6");
            return (Criteria) this;
        }

        public Criteria andNo6Like(String value) {
            addCriterion("no6 like", value, "no6");
            return (Criteria) this;
        }

        public Criteria andNo6NotLike(String value) {
            addCriterion("no6 not like", value, "no6");
            return (Criteria) this;
        }

        public Criteria andNo6In(List<String> values) {
            addCriterion("no6 in", values, "no6");
            return (Criteria) this;
        }

        public Criteria andNo6NotIn(List<String> values) {
            addCriterion("no6 not in", values, "no6");
            return (Criteria) this;
        }

        public Criteria andNo6Between(String value1, String value2) {
            addCriterion("no6 between", value1, value2, "no6");
            return (Criteria) this;
        }

        public Criteria andNo6NotBetween(String value1, String value2) {
            addCriterion("no6 not between", value1, value2, "no6");
            return (Criteria) this;
        }

        public Criteria andNo7IsNull() {
            addCriterion("no7 is null");
            return (Criteria) this;
        }

        public Criteria andNo7IsNotNull() {
            addCriterion("no7 is not null");
            return (Criteria) this;
        }

        public Criteria andNo7EqualTo(String value) {
            addCriterion("no7 =", value, "no7");
            return (Criteria) this;
        }

        public Criteria andNo7NotEqualTo(String value) {
            addCriterion("no7 <>", value, "no7");
            return (Criteria) this;
        }

        public Criteria andNo7GreaterThan(String value) {
            addCriterion("no7 >", value, "no7");
            return (Criteria) this;
        }

        public Criteria andNo7GreaterThanOrEqualTo(String value) {
            addCriterion("no7 >=", value, "no7");
            return (Criteria) this;
        }

        public Criteria andNo7LessThan(String value) {
            addCriterion("no7 <", value, "no7");
            return (Criteria) this;
        }

        public Criteria andNo7LessThanOrEqualTo(String value) {
            addCriterion("no7 <=", value, "no7");
            return (Criteria) this;
        }

        public Criteria andNo7Like(String value) {
            addCriterion("no7 like", value, "no7");
            return (Criteria) this;
        }

        public Criteria andNo7NotLike(String value) {
            addCriterion("no7 not like", value, "no7");
            return (Criteria) this;
        }

        public Criteria andNo7In(List<String> values) {
            addCriterion("no7 in", values, "no7");
            return (Criteria) this;
        }

        public Criteria andNo7NotIn(List<String> values) {
            addCriterion("no7 not in", values, "no7");
            return (Criteria) this;
        }

        public Criteria andNo7Between(String value1, String value2) {
            addCriterion("no7 between", value1, value2, "no7");
            return (Criteria) this;
        }

        public Criteria andNo7NotBetween(String value1, String value2) {
            addCriterion("no7 not between", value1, value2, "no7");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
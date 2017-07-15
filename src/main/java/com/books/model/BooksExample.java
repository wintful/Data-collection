package com.books.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BooksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BooksExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Integer value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Integer value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Integer value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Integer value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Integer> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Integer> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Integer value1, Integer value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNull() {
            addCriterion("book_name is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("book_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("book_name =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("book_name <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("book_name >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_name >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("book_name <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("book_name <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("book_name like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("book_name not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("book_name in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("book_name not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("book_name between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("book_name not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookImageIsNull() {
            addCriterion("book_image is null");
            return (Criteria) this;
        }

        public Criteria andBookImageIsNotNull() {
            addCriterion("book_image is not null");
            return (Criteria) this;
        }

        public Criteria andBookImageEqualTo(String value) {
            addCriterion("book_image =", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageNotEqualTo(String value) {
            addCriterion("book_image <>", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageGreaterThan(String value) {
            addCriterion("book_image >", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageGreaterThanOrEqualTo(String value) {
            addCriterion("book_image >=", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageLessThan(String value) {
            addCriterion("book_image <", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageLessThanOrEqualTo(String value) {
            addCriterion("book_image <=", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageLike(String value) {
            addCriterion("book_image like", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageNotLike(String value) {
            addCriterion("book_image not like", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageIn(List<String> values) {
            addCriterion("book_image in", values, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageNotIn(List<String> values) {
            addCriterion("book_image not in", values, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageBetween(String value1, String value2) {
            addCriterion("book_image between", value1, value2, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageNotBetween(String value1, String value2) {
            addCriterion("book_image not between", value1, value2, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookSynopsisIsNull() {
            addCriterion("book_synopsis is null");
            return (Criteria) this;
        }

        public Criteria andBookSynopsisIsNotNull() {
            addCriterion("book_synopsis is not null");
            return (Criteria) this;
        }

        public Criteria andBookSynopsisEqualTo(String value) {
            addCriterion("book_synopsis =", value, "bookSynopsis");
            return (Criteria) this;
        }

        public Criteria andBookSynopsisNotEqualTo(String value) {
            addCriterion("book_synopsis <>", value, "bookSynopsis");
            return (Criteria) this;
        }

        public Criteria andBookSynopsisGreaterThan(String value) {
            addCriterion("book_synopsis >", value, "bookSynopsis");
            return (Criteria) this;
        }

        public Criteria andBookSynopsisGreaterThanOrEqualTo(String value) {
            addCriterion("book_synopsis >=", value, "bookSynopsis");
            return (Criteria) this;
        }

        public Criteria andBookSynopsisLessThan(String value) {
            addCriterion("book_synopsis <", value, "bookSynopsis");
            return (Criteria) this;
        }

        public Criteria andBookSynopsisLessThanOrEqualTo(String value) {
            addCriterion("book_synopsis <=", value, "bookSynopsis");
            return (Criteria) this;
        }

        public Criteria andBookSynopsisLike(String value) {
            addCriterion("book_synopsis like", value, "bookSynopsis");
            return (Criteria) this;
        }

        public Criteria andBookSynopsisNotLike(String value) {
            addCriterion("book_synopsis not like", value, "bookSynopsis");
            return (Criteria) this;
        }

        public Criteria andBookSynopsisIn(List<String> values) {
            addCriterion("book_synopsis in", values, "bookSynopsis");
            return (Criteria) this;
        }

        public Criteria andBookSynopsisNotIn(List<String> values) {
            addCriterion("book_synopsis not in", values, "bookSynopsis");
            return (Criteria) this;
        }

        public Criteria andBookSynopsisBetween(String value1, String value2) {
            addCriterion("book_synopsis between", value1, value2, "bookSynopsis");
            return (Criteria) this;
        }

        public Criteria andBookSynopsisNotBetween(String value1, String value2) {
            addCriterion("book_synopsis not between", value1, value2, "bookSynopsis");
            return (Criteria) this;
        }

        public Criteria andBookPriceIsNull() {
            addCriterion("book_price is null");
            return (Criteria) this;
        }

        public Criteria andBookPriceIsNotNull() {
            addCriterion("book_price is not null");
            return (Criteria) this;
        }

        public Criteria andBookPriceEqualTo(BigDecimal value) {
            addCriterion("book_price =", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotEqualTo(BigDecimal value) {
            addCriterion("book_price <>", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceGreaterThan(BigDecimal value) {
            addCriterion("book_price >", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("book_price >=", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceLessThan(BigDecimal value) {
            addCriterion("book_price <", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("book_price <=", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceIn(List<BigDecimal> values) {
            addCriterion("book_price in", values, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotIn(List<BigDecimal> values) {
            addCriterion("book_price not in", values, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("book_price between", value1, value2, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("book_price not between", value1, value2, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookOriginalPriceIsNull() {
            addCriterion("book_original_price is null");
            return (Criteria) this;
        }

        public Criteria andBookOriginalPriceIsNotNull() {
            addCriterion("book_original_price is not null");
            return (Criteria) this;
        }

        public Criteria andBookOriginalPriceEqualTo(BigDecimal value) {
            addCriterion("book_original_price =", value, "bookOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andBookOriginalPriceNotEqualTo(BigDecimal value) {
            addCriterion("book_original_price <>", value, "bookOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andBookOriginalPriceGreaterThan(BigDecimal value) {
            addCriterion("book_original_price >", value, "bookOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andBookOriginalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("book_original_price >=", value, "bookOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andBookOriginalPriceLessThan(BigDecimal value) {
            addCriterion("book_original_price <", value, "bookOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andBookOriginalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("book_original_price <=", value, "bookOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andBookOriginalPriceIn(List<BigDecimal> values) {
            addCriterion("book_original_price in", values, "bookOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andBookOriginalPriceNotIn(List<BigDecimal> values) {
            addCriterion("book_original_price not in", values, "bookOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andBookOriginalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("book_original_price between", value1, value2, "bookOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andBookOriginalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("book_original_price not between", value1, value2, "bookOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andBookDiscountIsNull() {
            addCriterion("book_discount is null");
            return (Criteria) this;
        }

        public Criteria andBookDiscountIsNotNull() {
            addCriterion("book_discount is not null");
            return (Criteria) this;
        }

        public Criteria andBookDiscountEqualTo(Float value) {
            addCriterion("book_discount =", value, "bookDiscount");
            return (Criteria) this;
        }

        public Criteria andBookDiscountNotEqualTo(Float value) {
            addCriterion("book_discount <>", value, "bookDiscount");
            return (Criteria) this;
        }

        public Criteria andBookDiscountGreaterThan(Float value) {
            addCriterion("book_discount >", value, "bookDiscount");
            return (Criteria) this;
        }

        public Criteria andBookDiscountGreaterThanOrEqualTo(Float value) {
            addCriterion("book_discount >=", value, "bookDiscount");
            return (Criteria) this;
        }

        public Criteria andBookDiscountLessThan(Float value) {
            addCriterion("book_discount <", value, "bookDiscount");
            return (Criteria) this;
        }

        public Criteria andBookDiscountLessThanOrEqualTo(Float value) {
            addCriterion("book_discount <=", value, "bookDiscount");
            return (Criteria) this;
        }

        public Criteria andBookDiscountIn(List<Float> values) {
            addCriterion("book_discount in", values, "bookDiscount");
            return (Criteria) this;
        }

        public Criteria andBookDiscountNotIn(List<Float> values) {
            addCriterion("book_discount not in", values, "bookDiscount");
            return (Criteria) this;
        }

        public Criteria andBookDiscountBetween(Float value1, Float value2) {
            addCriterion("book_discount between", value1, value2, "bookDiscount");
            return (Criteria) this;
        }

        public Criteria andBookDiscountNotBetween(Float value1, Float value2) {
            addCriterion("book_discount not between", value1, value2, "bookDiscount");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIsNull() {
            addCriterion("book_author is null");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIsNotNull() {
            addCriterion("book_author is not null");
            return (Criteria) this;
        }

        public Criteria andBookAuthorEqualTo(String value) {
            addCriterion("book_author =", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotEqualTo(String value) {
            addCriterion("book_author <>", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorGreaterThan(String value) {
            addCriterion("book_author >", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("book_author >=", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLessThan(String value) {
            addCriterion("book_author <", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLessThanOrEqualTo(String value) {
            addCriterion("book_author <=", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLike(String value) {
            addCriterion("book_author like", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotLike(String value) {
            addCriterion("book_author not like", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIn(List<String> values) {
            addCriterion("book_author in", values, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotIn(List<String> values) {
            addCriterion("book_author not in", values, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorBetween(String value1, String value2) {
            addCriterion("book_author between", value1, value2, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotBetween(String value1, String value2) {
            addCriterion("book_author not between", value1, value2, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookTimeIsNull() {
            addCriterion("book_time is null");
            return (Criteria) this;
        }

        public Criteria andBookTimeIsNotNull() {
            addCriterion("book_time is not null");
            return (Criteria) this;
        }

        public Criteria andBookTimeEqualTo(Date value) {
            addCriterionForJDBCDate("book_time =", value, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("book_time <>", value, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("book_time >", value, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("book_time >=", value, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeLessThan(Date value) {
            addCriterionForJDBCDate("book_time <", value, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("book_time <=", value, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeIn(List<Date> values) {
            addCriterionForJDBCDate("book_time in", values, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("book_time not in", values, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("book_time between", value1, value2, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("book_time not between", value1, value2, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookPressIsNull() {
            addCriterion("book_press is null");
            return (Criteria) this;
        }

        public Criteria andBookPressIsNotNull() {
            addCriterion("book_press is not null");
            return (Criteria) this;
        }

        public Criteria andBookPressEqualTo(String value) {
            addCriterion("book_press =", value, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressNotEqualTo(String value) {
            addCriterion("book_press <>", value, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressGreaterThan(String value) {
            addCriterion("book_press >", value, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressGreaterThanOrEqualTo(String value) {
            addCriterion("book_press >=", value, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressLessThan(String value) {
            addCriterion("book_press <", value, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressLessThanOrEqualTo(String value) {
            addCriterion("book_press <=", value, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressLike(String value) {
            addCriterion("book_press like", value, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressNotLike(String value) {
            addCriterion("book_press not like", value, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressIn(List<String> values) {
            addCriterion("book_press in", values, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressNotIn(List<String> values) {
            addCriterion("book_press not in", values, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressBetween(String value1, String value2) {
            addCriterion("book_press between", value1, value2, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressNotBetween(String value1, String value2) {
            addCriterion("book_press not between", value1, value2, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionIsNull() {
            addCriterion("book_description is null");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionIsNotNull() {
            addCriterion("book_description is not null");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionEqualTo(String value) {
            addCriterion("book_description =", value, "bookDescription");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionNotEqualTo(String value) {
            addCriterion("book_description <>", value, "bookDescription");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionGreaterThan(String value) {
            addCriterion("book_description >", value, "bookDescription");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("book_description >=", value, "bookDescription");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionLessThan(String value) {
            addCriterion("book_description <", value, "bookDescription");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionLessThanOrEqualTo(String value) {
            addCriterion("book_description <=", value, "bookDescription");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionLike(String value) {
            addCriterion("book_description like", value, "bookDescription");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionNotLike(String value) {
            addCriterion("book_description not like", value, "bookDescription");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionIn(List<String> values) {
            addCriterion("book_description in", values, "bookDescription");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionNotIn(List<String> values) {
            addCriterion("book_description not in", values, "bookDescription");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionBetween(String value1, String value2) {
            addCriterion("book_description between", value1, value2, "bookDescription");
            return (Criteria) this;
        }

        public Criteria andBookDescriptionNotBetween(String value1, String value2) {
            addCriterion("book_description not between", value1, value2, "bookDescription");
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
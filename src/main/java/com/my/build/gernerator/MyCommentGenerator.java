package com.my.build.gernerator;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.MergeConstants;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * 自定义注释
 */
public class MyCommentGenerator implements CommentGenerator {
	/**
	 * Adds properties for this instance from any properties configured in the
	 * CommentGenerator configuration.
	 * <p>
	 * This method will be called before any of the other methods.
	 *
	 * @param properties All properties from the configuration
	 */
	@Override
	public void addConfigurationProperties(Properties properties) {

	}

	/**
	 * This method should add a Javadoc comment to the specified field. The field is related to the specified table and
	 * is used to hold the value of the specified column.
	 * <p>
	 * <p>
	 * <b>Important:</b> This method should add a the nonstandard JavaDoc tag "@mbg.generated" to the comment. Without
	 * this tag, the Eclipse based Java merge feature will fail.
	 *
	 * @param field              the field
	 * @param introspectedTable  the introspected table
	 * @param introspectedColumn
	 */
	@Override
	public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
		field.addJavaDocLine("/**");
		field.addJavaDocLine(" * columnName : " +
				introspectedColumn.getActualColumnName() + " jdbcType : " +
				introspectedColumn.getJdbcTypeName());
		field.addJavaDocLine(" * remarks : " + introspectedColumn.getRemarks());
		//field.addJavaDocLine(" * tableName :  " + introspectedTable.getFullyQualifiedTable());
		addJavadocTag(field, false);
		field.addJavaDocLine(" */");
	}

	/**
	 * Adds the field comment.
	 *
	 * @param field             the field
	 * @param introspectedTable
	 */
	@Override
	public void addFieldComment(Field field, IntrospectedTable introspectedTable) {

	}

	/**
	 * Adds a comment for a model class.  The Java code merger should
	 * be notified not to delete the entire class in case any manual
	 * changes have been made.  So this method will always use the
	 * "do not delete" annotation.
	 * <p>
	 * Because of difficulties with the Java file merger, the default implementation
	 * of this method should NOT add comments.  Comments should only be added if
	 * specifically requested by the user (for example, by enabling table remark comments).
	 *
	 * @param topLevelClass     the top level class
	 * @param introspectedTable
	 */
	@Override
	public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		topLevelClass.addJavaDocLine("/**");
		topLevelClass.addJavaDocLine(" * tableName : " + introspectedTable.getFullyQualifiedTable());
		topLevelClass.addJavaDocLine(" * remarks : " + introspectedTable.getRemarks());
		addJavadocTag(topLevelClass, false);
		topLevelClass.addJavaDocLine(" */");
	}

	/**
	 * Adds the inner class comment.
	 *
	 * @param innerClass        the inner class
	 * @param introspectedTable
	 */
	@Override
	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {

	}

	/**
	 * Adds the inner class comment.
	 *
	 * @param innerClass        the inner class
	 * @param introspectedTable the introspected table
	 * @param markAsDoNotDelete
	 */
	@Override
	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {

	}

	/**
	 * Adds the enum comment.
	 *
	 * @param innerEnum         the inner enum
	 * @param introspectedTable
	 */
	@Override
	public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {

	}

	/**
	 * Adds the getter comment.
	 *
	 * @param method             the method
	 * @param introspectedTable  the introspected table
	 * @param introspectedColumn
	 */
	@Override
	public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {

	}

	/**
	 * Adds the setter comment.
	 *
	 * @param method             the method
	 * @param introspectedTable  the introspected table
	 * @param introspectedColumn
	 */
	@Override
	public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {

	}

	/**
	 * Adds the general method comment.
	 *
	 * @param method            the method
	 * @param introspectedTable
	 */
	@Override
	public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {

	}

	/**
	 * This method is called to add a file level comment to a generated java file. This method could be used to add a
	 * general file comment (such as a copyright notice). However, note that the Java file merge function in Eclipse
	 * does not deal with this comment. If you run the generator repeatedly, you will only retain the comment from the
	 * initial run.
	 * <p>
	 * <p>
	 * The default implementation does nothing.
	 *
	 * @param compilationUnit the compilation unit
	 */
	@Override
	public void addJavaFileComment(CompilationUnit compilationUnit) {
		compilationUnit.addFileCommentLine("/**");
		compilationUnit.addFileCommentLine(" * Copyright (c) 2018-2028 - huawei");
		compilationUnit.addFileCommentLine(" */");
	}

	/**
	 * This method should add a suitable comment as a child element of the specified xmlElement to warn users that the
	 * element was generated and is subject to regeneration.
	 *
	 * @param xmlElement the xml element
	 */
	@Override
	public void addComment(XmlElement xmlElement) {

	}

	/**
	 * This method is called to add a comment as the first child of the root element. This method could be used to add a
	 * general file comment (such as a copyright notice). However, note that the XML file merge function does not deal
	 * with this comment. If you run the generator repeatedly, you will only retain the comment from the initial run.
	 * <p>
	 * <p>
	 * The default implementation does nothing.
	 *
	 * @param rootElement the root element
	 */
	@Override
	public void addRootComment(XmlElement rootElement) {

	}

	protected void addJavadocTag(JavaElement javaElement,
	                             boolean markAsDoNotDelete) {
		javaElement.addJavaDocLine(" *"); //$NON-NLS-1$
		StringBuilder sb = new StringBuilder();
		sb.append(" * "); //$NON-NLS-1$
		sb.append(MergeConstants.NEW_ELEMENT_TAG);
		if (markAsDoNotDelete) {
			sb.append(" do_not_delete_during_merge"); //$NON-NLS-1$
		}
		String s = getDateString();
		if (s != null) {
			sb.append(' ');
			sb.append(s);
		}
		javaElement.addJavaDocLine(sb.toString());
	}

	protected String getDateString() {
		return SimpleDateFormat.getDateTimeInstance().format(new Date());
	}
}

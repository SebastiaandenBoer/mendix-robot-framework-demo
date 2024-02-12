// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.IMendixObject;
import communitycommons.StringUtils;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Identical to SubstituteTemplate, but adds an datetimeformat argument
 * 
 * DateTimeFormat identifies a format string which is applied to date/time based attributes. Can be left empty. Defaults to "EEE dd MMM yyyy, HH:mm"
 */
public class SubstituteTemplate2 extends CustomJavaAction<java.lang.String>
{
	private final java.lang.String template;
	private final IMendixObject substitute;
	private final java.lang.Boolean useHTMLEncoding;
	private final java.lang.String datetimeformat;

	public SubstituteTemplate2(
		IContext context,
		java.lang.String _template,
		IMendixObject _substitute,
		java.lang.Boolean _useHTMLEncoding,
		java.lang.String _datetimeformat
	)
	{
		super(context);
		this.template = _template;
		this.substitute = _substitute;
		this.useHTMLEncoding = _useHTMLEncoding;
		this.datetimeformat = _datetimeformat;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		return StringUtils.substituteTemplate(this.getContext(), template, substitute, useHTMLEncoding, this.datetimeformat);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "SubstituteTemplate2";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
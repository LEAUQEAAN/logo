/*
 * generated by Xtext
 */
package example.logo.xtext_editor.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class LogoTextualSyntaxAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.tokens");
	}
}
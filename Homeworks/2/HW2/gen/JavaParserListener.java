// Generated from D:/Bahareh/7/Files/Compiler/HW2/JavaParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaParser}.
 */
public interface JavaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(JavaParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(JavaParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JavaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JavaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(JavaParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(JavaParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#unqualifiedMethodIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedMethodIdentifier(JavaParser.UnqualifiedMethodIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unqualifiedMethodIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedMethodIdentifier(JavaParser.UnqualifiedMethodIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JavaParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JavaParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(JavaParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(JavaParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(JavaParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(JavaParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(JavaParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(JavaParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(JavaParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(JavaParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#coit}.
	 * @param ctx the parse tree
	 */
	void enterCoit(JavaParser.CoitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#coit}.
	 * @param ctx the parse tree
	 */
	void exitCoit(JavaParser.CoitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(JavaParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(JavaParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(JavaParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(JavaParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(JavaParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(JavaParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(JavaParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(JavaParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(JavaParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(JavaParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(JavaParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(JavaParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(JavaParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(JavaParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(JavaParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(JavaParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(JavaParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(JavaParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(JavaParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(JavaParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(JavaParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(JavaParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(JavaParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(JavaParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(JavaParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(JavaParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(JavaParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(JavaParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void enterModuleName(JavaParser.ModuleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void exitModuleName(JavaParser.ModuleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(JavaParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(JavaParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(JavaParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(JavaParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(JavaParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(JavaParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(JavaParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(JavaParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(JavaParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(JavaParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(JavaParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(JavaParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JavaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JavaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#ordinaryCompilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterOrdinaryCompilationUnit(JavaParser.OrdinaryCompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#ordinaryCompilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitOrdinaryCompilationUnit(JavaParser.OrdinaryCompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#modularCompilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterModularCompilationUnit(JavaParser.ModularCompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#modularCompilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitModularCompilationUnit(JavaParser.ModularCompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(JavaParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(JavaParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(JavaParser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(JavaParser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JavaParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JavaParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(JavaParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(JavaParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(JavaParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(JavaParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(JavaParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(JavaParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(JavaParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(JavaParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#topLevelClassOrInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelClassOrInterfaceDeclaration(JavaParser.TopLevelClassOrInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#topLevelClassOrInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelClassOrInterfaceDeclaration(JavaParser.TopLevelClassOrInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclaration(JavaParser.ModuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclaration(JavaParser.ModuleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void enterModuleDirective(JavaParser.ModuleDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void exitModuleDirective(JavaParser.ModuleDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#requiresModifier}.
	 * @param ctx the parse tree
	 */
	void enterRequiresModifier(JavaParser.RequiresModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#requiresModifier}.
	 * @param ctx the parse tree
	 */
	void exitRequiresModifier(JavaParser.RequiresModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(JavaParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(JavaParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(JavaParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(JavaParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(JavaParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(JavaParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(JavaParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(JavaParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classExtends}.
	 * @param ctx the parse tree
	 */
	void enterClassExtends(JavaParser.ClassExtendsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classExtends}.
	 * @param ctx the parse tree
	 */
	void exitClassExtends(JavaParser.ClassExtendsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classImplements}.
	 * @param ctx the parse tree
	 */
	void enterClassImplements(JavaParser.ClassImplementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classImplements}.
	 * @param ctx the parse tree
	 */
	void exitClassImplements(JavaParser.ClassImplementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(JavaParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(JavaParser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classPermits}.
	 * @param ctx the parse tree
	 */
	void enterClassPermits(JavaParser.ClassPermitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classPermits}.
	 * @param ctx the parse tree
	 */
	void exitClassPermits(JavaParser.ClassPermitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JavaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JavaParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(JavaParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(JavaParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JavaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JavaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(JavaParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(JavaParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(JavaParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(JavaParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JavaParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JavaParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JavaParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JavaParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(JavaParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(JavaParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(JavaParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(JavaParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(JavaParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(JavaParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(JavaParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(JavaParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#uCOIT}.
	 * @param ctx the parse tree
	 */
	void enterUCOIT(JavaParser.UCOITContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#uCOIT}.
	 * @param ctx the parse tree
	 */
	void exitUCOIT(JavaParser.UCOITContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(JavaParser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(JavaParser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(JavaParser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(JavaParser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(JavaParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(JavaParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(JavaParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(JavaParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(JavaParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(JavaParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(JavaParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(JavaParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(JavaParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(JavaParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(JavaParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(JavaParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(JavaParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(JavaParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(JavaParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(JavaParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JavaParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JavaParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableArityParameter}.
	 * @param ctx the parse tree
	 */
	void enterVariableArityParameter(JavaParser.VariableArityParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableArityParameter}.
	 * @param ctx the parse tree
	 */
	void exitVariableArityParameter(JavaParser.VariableArityParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(JavaParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(JavaParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#throwsT}.
	 * @param ctx the parse tree
	 */
	void enterThrowsT(JavaParser.ThrowsTContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#throwsT}.
	 * @param ctx the parse tree
	 */
	void exitThrowsT(JavaParser.ThrowsTContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(JavaParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(JavaParser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(JavaParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(JavaParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JavaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(JavaParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(JavaParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(JavaParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(JavaParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(JavaParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(JavaParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(JavaParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(JavaParser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(JavaParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(JavaParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(JavaParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(JavaParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(JavaParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(JavaParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(JavaParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(JavaParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(JavaParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(JavaParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(JavaParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(JavaParser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(JavaParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(JavaParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(JavaParser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(JavaParser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(JavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(JavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRecordDeclaration(JavaParser.RecordDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRecordDeclaration(JavaParser.RecordDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#recordHeader}.
	 * @param ctx the parse tree
	 */
	void enterRecordHeader(JavaParser.RecordHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#recordHeader}.
	 * @param ctx the parse tree
	 */
	void exitRecordHeader(JavaParser.RecordHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#recordComponentList}.
	 * @param ctx the parse tree
	 */
	void enterRecordComponentList(JavaParser.RecordComponentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#recordComponentList}.
	 * @param ctx the parse tree
	 */
	void exitRecordComponentList(JavaParser.RecordComponentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#recordComponent}.
	 * @param ctx the parse tree
	 */
	void enterRecordComponent(JavaParser.RecordComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#recordComponent}.
	 * @param ctx the parse tree
	 */
	void exitRecordComponent(JavaParser.RecordComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableArityRecordComponent}.
	 * @param ctx the parse tree
	 */
	void enterVariableArityRecordComponent(JavaParser.VariableArityRecordComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableArityRecordComponent}.
	 * @param ctx the parse tree
	 */
	void exitVariableArityRecordComponent(JavaParser.VariableArityRecordComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#recordComponentModifier}.
	 * @param ctx the parse tree
	 */
	void enterRecordComponentModifier(JavaParser.RecordComponentModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#recordComponentModifier}.
	 * @param ctx the parse tree
	 */
	void exitRecordComponentModifier(JavaParser.RecordComponentModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#recordBody}.
	 * @param ctx the parse tree
	 */
	void enterRecordBody(JavaParser.RecordBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#recordBody}.
	 * @param ctx the parse tree
	 */
	void exitRecordBody(JavaParser.RecordBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#recordBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRecordBodyDeclaration(JavaParser.RecordBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#recordBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRecordBodyDeclaration(JavaParser.RecordBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#compactConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCompactConstructorDeclaration(JavaParser.CompactConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#compactConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCompactConstructorDeclaration(JavaParser.CompactConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(JavaParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(JavaParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(JavaParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(JavaParser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceExtends}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceExtends(JavaParser.InterfaceExtendsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceExtends}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceExtends(JavaParser.InterfaceExtendsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfacePermits}.
	 * @param ctx the parse tree
	 */
	void enterInterfacePermits(JavaParser.InterfacePermitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfacePermits}.
	 * @param ctx the parse tree
	 */
	void exitInterfacePermits(JavaParser.InterfacePermitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(JavaParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(JavaParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(JavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(JavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(JavaParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(JavaParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(JavaParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(JavaParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(JavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(JavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(JavaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(JavaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationInterfaceDeclaration(JavaParser.AnnotationInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationInterfaceDeclaration(JavaParser.AnnotationInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationInterfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationInterfaceBody(JavaParser.AnnotationInterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationInterfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationInterfaceBody(JavaParser.AnnotationInterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationInterfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationInterfaceMemberDeclaration(JavaParser.AnnotationInterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationInterfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationInterfaceMemberDeclaration(JavaParser.AnnotationInterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationInterfaceElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationInterfaceElementDeclaration(JavaParser.AnnotationInterfaceElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationInterfaceElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationInterfaceElementDeclaration(JavaParser.AnnotationInterfaceElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotationInterfaceElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationInterfaceElementModifier(JavaParser.AnnotationInterfaceElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotationInterfaceElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationInterfaceElementModifier(JavaParser.AnnotationInterfaceElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(JavaParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(JavaParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(JavaParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(JavaParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(JavaParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(JavaParser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(JavaParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(JavaParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(JavaParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(JavaParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(JavaParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(JavaParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(JavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(JavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(JavaParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(JavaParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(JavaParser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(JavaParser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(JavaParser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(JavaParser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(JavaParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(JavaParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(JavaParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(JavaParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(JavaParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(JavaParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JavaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JavaParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#localClassOrInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalClassOrInterfaceDeclaration(JavaParser.LocalClassOrInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#localClassOrInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalClassOrInterfaceDeclaration(JavaParser.LocalClassOrInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#localVariableType}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableType(JavaParser.LocalVariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#localVariableType}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableType(JavaParser.LocalVariableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(JavaParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(JavaParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(JavaParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(JavaParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(JavaParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(JavaParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(JavaParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(JavaParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(JavaParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(JavaParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(JavaParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(JavaParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JavaParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JavaParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(JavaParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(JavaParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(JavaParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(JavaParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(JavaParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(JavaParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(JavaParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(JavaParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(JavaParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(JavaParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(JavaParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(JavaParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(JavaParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(JavaParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#switchRule}.
	 * @param ctx the parse tree
	 */
	void enterSwitchRule(JavaParser.SwitchRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#switchRule}.
	 * @param ctx the parse tree
	 */
	void exitSwitchRule(JavaParser.SwitchRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(JavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(JavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(JavaParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(JavaParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#caseConstant}.
	 * @param ctx the parse tree
	 */
	void enterCaseConstant(JavaParser.CaseConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#caseConstant}.
	 * @param ctx the parse tree
	 */
	void exitCaseConstant(JavaParser.CaseConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(JavaParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(JavaParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(JavaParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(JavaParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JavaParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JavaParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(JavaParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(JavaParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(JavaParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(JavaParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(JavaParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(JavaParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(JavaParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(JavaParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(JavaParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(JavaParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(JavaParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(JavaParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(JavaParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(JavaParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(JavaParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(JavaParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(JavaParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(JavaParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(JavaParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(JavaParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JavaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JavaParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(JavaParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(JavaParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(JavaParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(JavaParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tryStatement1}
	 * labeled alternative in {@link JavaParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement1(JavaParser.TryStatement1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code tryStatement1}
	 * labeled alternative in {@link JavaParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement1(JavaParser.TryStatement1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tryStatement2}
	 * labeled alternative in {@link JavaParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement2(JavaParser.TryStatement2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code tryStatement2}
	 * labeled alternative in {@link JavaParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement2(JavaParser.TryStatement2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tryStatement3}
	 * labeled alternative in {@link JavaParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement3(JavaParser.TryStatement3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code tryStatement3}
	 * labeled alternative in {@link JavaParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement3(JavaParser.TryStatement3Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(JavaParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(JavaParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(JavaParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(JavaParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(JavaParser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(JavaParser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(JavaParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(JavaParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(JavaParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(JavaParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(JavaParser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(JavaParser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(JavaParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(JavaParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(JavaParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(JavaParser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(JavaParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(JavaParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableAccess}.
	 * @param ctx the parse tree
	 */
	void enterVariableAccess(JavaParser.VariableAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableAccess}.
	 * @param ctx the parse tree
	 */
	void exitVariableAccess(JavaParser.VariableAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#yieldStatement}.
	 * @param ctx the parse tree
	 */
	void enterYieldStatement(JavaParser.YieldStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#yieldStatement}.
	 * @param ctx the parse tree
	 */
	void exitYieldStatement(JavaParser.YieldStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(JavaParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(JavaParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typePattern}.
	 * @param ctx the parse tree
	 */
	void enterTypePattern(JavaParser.TypePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typePattern}.
	 * @param ctx the parse tree
	 */
	void exitTypePattern(JavaParser.TypePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JavaParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JavaParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(JavaParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(JavaParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#pNNA}.
	 * @param ctx the parse tree
	 */
	void enterPNNA(JavaParser.PNNAContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#pNNA}.
	 * @param ctx the parse tree
	 */
	void exitPNNA(JavaParser.PNNAContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classLiteral}.
	 * @param ctx the parse tree
	 */
	void enterClassLiteral(JavaParser.ClassLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classLiteral}.
	 * @param ctx the parse tree
	 */
	void exitClassLiteral(JavaParser.ClassLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(JavaParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(JavaParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#unqualifiedClassInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedClassInstanceCreationExpression(JavaParser.UnqualifiedClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unqualifiedClassInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedClassInstanceCreationExpression(JavaParser.UnqualifiedClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classOrInterfaceTypeToInstantiate}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceTypeToInstantiate(JavaParser.ClassOrInterfaceTypeToInstantiateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classOrInterfaceTypeToInstantiate}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceTypeToInstantiate(JavaParser.ClassOrInterfaceTypeToInstantiateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(JavaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(JavaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(JavaParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(JavaParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#arrayCreationExpressionWithoutInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpressionWithoutInitializer(JavaParser.ArrayCreationExpressionWithoutInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#arrayCreationExpressionWithoutInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpressionWithoutInitializer(JavaParser.ArrayCreationExpressionWithoutInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#arrayCreationExpressionWithInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpressionWithInitializer(JavaParser.ArrayCreationExpressionWithInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#arrayCreationExpressionWithInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpressionWithInitializer(JavaParser.ArrayCreationExpressionWithInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(JavaParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(JavaParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(JavaParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(JavaParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(JavaParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(JavaParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(JavaParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(JavaParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(JavaParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(JavaParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(JavaParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(JavaParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(JavaParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(JavaParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(JavaParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(JavaParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#pfE}.
	 * @param ctx the parse tree
	 */
	void enterPfE(JavaParser.PfEContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#pfE}.
	 * @param ctx the parse tree
	 */
	void exitPfE(JavaParser.PfEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(JavaParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(JavaParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(JavaParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(JavaParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(JavaParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(JavaParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(JavaParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(JavaParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(JavaParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(JavaParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(JavaParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(JavaParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(JavaParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(JavaParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(JavaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(JavaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(JavaParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(JavaParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(JavaParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(JavaParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(JavaParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(JavaParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(JavaParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(JavaParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(JavaParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(JavaParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(JavaParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(JavaParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(JavaParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(JavaParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(JavaParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(JavaParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(JavaParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(JavaParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(JavaParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(JavaParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(JavaParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(JavaParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JavaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JavaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(JavaParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(JavaParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(JavaParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(JavaParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(JavaParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(JavaParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(JavaParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(JavaParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#lambdaParameterList}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameterList(JavaParser.LambdaParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#lambdaParameterList}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameterList(JavaParser.LambdaParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#lambdaParameter}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameter(JavaParser.LambdaParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#lambdaParameter}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameter(JavaParser.LambdaParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#lambdaParameterType}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameterType(JavaParser.LambdaParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#lambdaParameterType}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameterType(JavaParser.LambdaParameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(JavaParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(JavaParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#switchExpression}.
	 * @param ctx the parse tree
	 */
	void enterSwitchExpression(JavaParser.SwitchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#switchExpression}.
	 * @param ctx the parse tree
	 */
	void exitSwitchExpression(JavaParser.SwitchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(JavaParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(JavaParser.ConstantExpressionContext ctx);
}
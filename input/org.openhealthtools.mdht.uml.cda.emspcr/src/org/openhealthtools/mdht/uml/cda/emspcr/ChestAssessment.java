/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chest Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getChestAssessment()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ChestAssessmentTemplateId ChestAssessmentCode ChestAssessmentCodeP ChestAssessmentValue ChestAssessmentValueP ChestAssessmentTargetSiteCode' templateId.root='2.16.840.1.1133883.17.3.10.1.195' templateId.extension='2022-01-01' code.code='11422-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Physical Findings of Chest Assessment' constraints.validation.dependOn.ChestAssessmentCode='ChestAssessmentCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC' targetSiteCode.codeSystem='2.16.840.1.113883.6.1' targetSiteCode.codeSystemName='LOINC' constraints.validation.warning='ChestAssessmentTargetSiteCodeP'"
 * @generated
 */
public interface ChestAssessment extends Observation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.195\' and id.extension = \'2022-01-01\')'"
	 * @generated
	 */
	boolean validateChestAssessmentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateChestAssessmentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'11422-3\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateChestAssessmentCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value-&gt;isEmpty() or self.value-&gt;exists(element | element.isNullFlavorUndefined())) implies (not self.value-&gt;isEmpty() and self.value-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'LA17208-2\' or value.code = \'LA18236-2\' or value.code = \'LA7452-1\' or value.code = \'LA6626-1\' or value.code = \'LA7423-2\' or value.code = \'LA18225-5\' or value.code = \'LA23810-7\' or value.code = \'LA17229-8\' or value.code = \'LA33345-2\' or value.code = \'LA33353-6\' or value.code = \'LA33346-0\' or value.code = \'LA33342-9\' or value.code = \'LA17209-0\' or value.code = \'LA17222-3\' or value.code = \'LA18220-6\' or value.code = \'LA7410-9\' or value.code = \'LA7460-4\' or value.code = \'LA33332-0\' or value.code = \'LA17214-0\' or value.code = \'LA18231-3\' or value.code = \'LA17709-9\' or value.code = \'LA17212-4\' or value.code = \'LA22440-4\' or value.code = \'LA33338-7\')))'"
	 * @generated
	 */
	boolean validateChestAssessmentValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value-&gt;isEmpty() or self.value-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not self.value-&gt;isEmpty())  and self.value-&gt;forAll(element | element.oclIsTypeOf(datatypes::CD)))'"
	 * @generated
	 */
	boolean validateChestAssessmentValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.targetSiteCode-&gt;isEmpty() or self.targetSiteCode-&gt;exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'LA33302-3\' or value.code = \'LA33301-5\' or value.code = \'LA33300-7\' or value.code = \'LA33299-1\' or value.code = \'LA33297-5\' or value.code = \'LA33296-7\' or value.code = \'LA33298-3\' or value.code = \'LA33295-9\')))'"
	 * @generated
	 */
	boolean validateChestAssessmentTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.targetSiteCode-&gt;isEmpty() or self.targetSiteCode-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not self.targetSiteCode-&gt;isEmpty()) )'"
	 * @generated
	 */
	boolean validateChestAssessmentTargetSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChestAssessment init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ChestAssessment init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ChestAssessment

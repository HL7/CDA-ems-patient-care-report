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
 * A representation of the model object '<em><b>Dispatch Reason</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getDispatchReason()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='DispatchReasonTemplateId DispatchReasonMoodCode DispatchReasonCode DispatchReasonCodeP DispatchReasonValue DispatchReasonValueP' templateId.root='2.16.840.1.1133883.17.3.10.1.74' templateId.extension='2022-01-01' moodCode='EVN' code.code='67570-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Chief complaint per dispatch Reported.dispatch' constraints.validation.dependOn.DispatchReasonCode='DispatchReasonCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 * @generated
 */
public interface DispatchReason extends Observation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.74\' and id.extension = \'2022-01-01\')'"
	 * @generated
	 */
	boolean validateDispatchReasonTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\')'"
	 * @generated
	 */
	boolean validateDispatchReasonMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateDispatchReasonCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'67570-2\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateDispatchReasonCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value-&gt;isEmpty() or self.value-&gt;exists(element | element.isNullFlavorUndefined())) implies (self.value-&gt;size() = 1 and self.value-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'LA23843-8\' or value.code = \'LA15903-0\' or value.code = \'LA17117-5\' or value.code = \'LA17118-3\' or value.code = \'LA17119-1\' or value.code = \'LA17120-9\' or value.code = \'LA17121-7\' or value.code = \'LA17122-5\' or value.code = \'LA17123-3\' or value.code = \'LA17124-1\' or value.code = \'LA17125-8\' or value.code = \'LA17126-6\' or value.code = \'LA17127-4\' or value.code = \'LA17128-2\' or value.code = \'LA17129-0\' or value.code = \'LA17131-6\' or value.code = \'LA17132-4\' or value.code = \'LA17133-2\' or value.code = \'LA17134-0\' or value.code = \'LA17135-7\' or value.code = \'LA17136-5\' or value.code = \'LA17137-3\' or value.code = \'LA17138-1\' or value.code = \'LA17140-7\' or value.code = \'LA17141-5\' or value.code = \'LA17142-3\' or value.code = \'LA17143-1\' or value.code = \'LA17144-9\' or value.code = \'LA17145-6\' or value.code = \'LA17146-4\' or value.code = \'LA17147-2\' or value.code = \'LA17148-0\' or value.code = \'LA17149-8\' or value.code = \'LA17150-6\' or value.code = \'LA18093-7\' or value.code = \'LA18209-9\' or value.code = \'LA18210-7\' or value.code = \'LA18211-5\' or value.code = \'LA9553-4\' or value.code = \'LA9555-9\' or value.code = \'LA17130-8\' or value.code = \'LA23800-8\' or value.code = \'NewLA-NewLA-2301085\' or value.code = \'NewLA-2301087\' or value.code = \'NewLA-2301089\' or value.code = \'NewLA-2301091\')))'"
	 * @generated
	 */
	boolean validateDispatchReasonValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value-&gt;isEmpty() or self.value-&gt;exists(element | element.isNullFlavorUndefined())) implies (self.value-&gt;size() =  1 and self.value-&gt;forAll(element | element.oclIsTypeOf(datatypes::CD)))'"
	 * @generated
	 */
	boolean validateDispatchReasonValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatchReason init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DispatchReason init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // DispatchReason

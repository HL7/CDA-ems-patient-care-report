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
 * A representation of the model object '<em><b>Protocol Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getProtocolObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProtocolObservationTemplateId ProtocolObservationMoodCode ProtocolObservationCode ProtocolObservationCodeP ProtocolObservationValue ProtocolObservationValueP' templateId.root='2.16.840.1.1133883.17.3.10.1.93' templateId.extension='2022-01-01' moodCode='EVN' code.code='67537-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Protocol used NEMSIS' constraints.validation.dependOn.ProtocolObservationCode='ProtocolObservationCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProtocolObservationProtocolAgeCategoryRelationship constraints.validation.error='ProtocolObservationProtocolAgeCategoryRelationshipProtocolAgeCategory'"
 * @generated
 */
public interface ProtocolObservation extends Observation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.93\' and id.extension = \'2022-01-01\')'"
	 * @generated
	 */
	boolean validateProtocolObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProtocolObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProtocolObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'67537-1\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateProtocolObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value-&gt;isEmpty() or self.value-&gt;exists(element | element.isNullFlavorUndefined())) implies (self.value-&gt;size() = 1 and self.value-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'LA17398-1\' or value.code = \'LA17491-4\' or value.code = \'LA17492-2\' or value.code = \'LA17494-8\' or value.code = \'LA17495-5\' or value.code = \'LA17496-3\' or value.code = \'LA17497-1\' or value.code = \'LA17498-9\' or value.code = \'LA17499-7\' or value.code = \'LA17500-2\' or value.code = \'LA17501-0\' or value.code = \'LA17502-8\' or value.code = \'LA17503-6\' or value.code = \'LA17504-4\' or value.code = \'LA17505-1\' or value.code = \'LA17506-9\' or value.code = \'LA17507-7\' or value.code = \'LA17508-5\' or value.code = \'LA17509-3\' or value.code = \'LA24135-8\' or value.code = \'LA17511-9\' or value.code = \'LA17512-7\' or value.code = \'LA17513-5\' or value.code = \'LA17514-3\' or value.code = \'LA17515-0\' or value.code = \'LA17516-8\' or value.code = \'LA17517-6\' or value.code = \'LA17518-4\' or value.code = \'LA17519-2\' or value.code = \'LA17520-0\' or value.code = \'LA17521-8\' or value.code = \'LA17522-6\' or value.code = \'LA17523-4\' or value.code = \'LA17524-2\' or value.code = \'LA17525-9\' or value.code = \'LA17526-7\' or value.code = \'LA17527-5\' or value.code = \'LA17528-3\' or value.code = \'LA17529-1\' or value.code = \'LA17530-9\' or value.code = \'LA17531-7\' or value.code = \'LA17532-5\' or value.code = \'LA17533-3\' or value.code = \'LA17534-1\' or value.code = \'LA17535-8\' or value.code = \'LA17536-6\' or value.code = \'LA17537-4\' or value.code = \'LA17538-2\' or value.code = \'LA17539-0\' or value.code = \'LA17540-8\' or value.code = \'LA17541-6\' or value.code = \'LA17542-4\' or value.code = \'LA17543-2\' or value.code = \'LA17544-0\' or value.code = \'LA17545-7\' or value.code = \'LA17546-5\' or value.code = \'LA17547-3\' or value.code = \'LA17548-1\' or value.code = \'LA17549-9\' or value.code = \'LA17550-7\' or value.code = \'LA17551-5\' or value.code = \'LA17552-3\' or value.code = \'LA17553-1\' or value.code = \'LA17554-9\' or value.code = \'LA17555-6\' or value.code = \'LA17556-4\' or value.code = \'LA23845-3\' or value.code = \'LA17558-0\' or value.code = \'LA17559-8\' or value.code = \'LA17560-6\' or value.code = \'LA17561-4\' or value.code = \'LA17562-2\' or value.code = \'LA17563-0\' or value.code = \'LA17564-8\' or value.code = \'LA17565-5\' or value.code = \'LA17566-3\' or value.code = \'LA17567-1\' or value.code = \'LA17568-9\' or value.code = \'LA17569-7\' or value.code = \'LA17570-5\' or value.code = \'LA18269-3\' or value.code = \'LA46-8\' or value.code = \'LA23828-9\' or value.code = \'LA23829-7\' or value.code = \'LA23830-5\' or value.code = \'LA23831-3\' or value.code = \'LA23832-1\' or value.code = \'LA23833-9\' or value.code = \'LA23834-7\' or value.code = \'LA23835-4\' or value.code = \'LA23836-2\' or value.code = \'LA23837-0\' or value.code = \'LA23838-8\' or value.code = \'LA23839-6\' or value.code = \'LA24136-6\' or value.code = \'LA24137-4\' or value.code = \'LA24139-0\' or value.code = \'LA24140-8\' or value.code = \'LA24141-6\' or value.code = \'LA24142-4\' or value.code = \'LA24143-2\' or value.code = \'LA24144-0\' or value.code = \'LA24145-7\' or value.code = \'LA24146-5\' or value.code = \'LA24147-3\' or value.code = \'LA24148-1\' or value.code = \'LA24149-9\' or value.code = \'LA24150-7\' or value.code = \'LA24151-5\' or value.code = \'LA23827-1\' or value.code = \'LA24138-2\')))'"
	 * @generated
	 */
	boolean validateProtocolObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProtocolObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolObservation init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ProtocolObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProtocolObservation

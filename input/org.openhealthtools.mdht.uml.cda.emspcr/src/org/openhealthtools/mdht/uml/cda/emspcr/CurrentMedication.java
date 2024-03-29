/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.SubstanceAdministration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Current Medication</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getCurrentMedication()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='CurrentMedicationConsumable CurrentMedicationTemplateId CurrentMedicationRouteCode' templateId.root='2.16.840.1.1133883.17.3.10.1.77' templateId.extension='2022-01-01' constraints.validation.info='CurrentMedicationNegationInd CurrentMedicationNullFlavor' constraints.validation.warning='CurrentMedicationDoseQuantity CurrentMedicationRouteCodeP' routeCode.codeSystem='2.16.840.1.113883.3.26.1.1.1' routeCode.codeSystemName='FDA Route of Administration' constraints.validation.dependOn.CurrentMedicationRouteCode='CurrentMedicationRouteCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrCurrentMedicationCurrentMedicationConsumable constraints.validation.error='CurrentMedicationCurrentMedicationConsumableManufacturedProduct'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrCurrentMedicationCurrentMedicationConsumableCurrentMedicationProduct constraints.validation.error='CurrentMedicationCurrentMedicationConsumableCurrentMedicationProductManufacturedMaterial'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrCurrentMedicationCurrentMedicationConsumableCurrentMedicationProductCurrentMedicationDrug code.codeSystem='2.16.840.1.113883.6.88' code.codeSystemName='RxNorm' constraints.validation.error='CurrentMedicationCurrentMedicationConsumableCurrentMedicationProductCurrentMedicationDrugCode CurrentMedicationCurrentMedicationConsumableCurrentMedicationProductCurrentMedicationDrugCodeP'"
 * @generated
 */
public interface CurrentMedication extends SubstanceAdministration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.consumable-&gt;one(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(cda::Consumable))'"
	 * @generated
	 */
	boolean validateCurrentMedicationConsumable(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.77\' and id.extension = \'2022-01-01\')'"
	 * @generated
	 */
	boolean validateCurrentMedicationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.negationInd.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateCurrentMedicationNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'nullFlavor\')'"
	 * @generated
	 */
	boolean validateCurrentMedicationNullFlavor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateCurrentMedicationDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateCurrentMedicationRouteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.3.26.1.1.1\' and (value.code = \'C38208\' or value.code = \'C38246\' or value.code = \'C38216\' or value.code = \'C38222\' or value.code = \'C38284\' or value.code = \'C28161\' or value.code = \'C38255\' or value.code = \'C38276\' or value.code = \'C38285\' or value.code = \'C38287\' or value.code = \'C38288\' or value.code = \'C38290\' or value.code = \'C38192\' or value.code = \'C38295\' or value.code = \'C38299\' or value.code = \'C38300\' or value.code = \'C38304\' or value.code = \'C38305\' or value.code = \'C38271\' or value.code = \'C38193\' or value.code = \'C38238\' or value.code = \'C64987\' or value.code = \'C38250\' or value.code = \'C38676\'))'"
	 * @generated
	 */
	boolean validateCurrentMedicationRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentMedication init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CurrentMedication init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // CurrentMedication

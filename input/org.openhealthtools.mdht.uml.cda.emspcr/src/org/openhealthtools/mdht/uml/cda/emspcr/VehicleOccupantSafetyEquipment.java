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
 * A representation of the model object '<em><b>Vehicle Occupant Safety Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getVehicleOccupantSafetyEquipment()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='VehicleOccupantSafetyEquipmentTemplateId VehicleOccupantSafetyEquipmentMoodCode VehicleOccupantSafetyEquipmentCode VehicleOccupantSafetyEquipmentCodeP VehicleOccupantSafetyEquipmentValue VehicleOccupantSafetyEquipmentValueP' templateId.root='2.16.840.1.1133883.17.3.10.1.56' templateId.extension='2022-01-01' moodCode='EVN' code.code='67499-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Safety equipment NEMSIS' constraints.validation.dependOn.VehicleOccupantSafetyEquipmentCode='VehicleOccupantSafetyEquipmentCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC'"
 * @generated
 */
public interface VehicleOccupantSafetyEquipment extends Observation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.56\' and id.extension = \'2022-01-01\')'"
	 * @generated
	 */
	boolean validateVehicleOccupantSafetyEquipmentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateVehicleOccupantSafetyEquipmentMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateVehicleOccupantSafetyEquipmentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'67499-4\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateVehicleOccupantSafetyEquipmentCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value-&gt;isEmpty() or self.value-&gt;exists(element | element.isNullFlavorUndefined())) implies (not self.value-&gt;isEmpty() and self.value-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'LA137-2\' or value.code = \'LA17375-9\' or value.code = \'LA17376-7\' or value.code = \'LA17377-5\' or value.code = \'LA17378-3\' or value.code = \'LA17379-1\' or value.code = \'LA17380-9\' or value.code = \'LA17382-5\' or value.code = \'LA46-8\' or value.code = \'LA9381-0\' or value.code = \'LA9391-9\' or value.code = \'LA9392-7\' or value.code = \'LA9393-5\' or value.code = \'LA11137-9\')))'"
	 * @generated
	 */
	boolean validateVehicleOccupantSafetyEquipmentValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateVehicleOccupantSafetyEquipmentValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleOccupantSafetyEquipment init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public VehicleOccupantSafetyEquipment init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // VehicleOccupantSafetyEquipment

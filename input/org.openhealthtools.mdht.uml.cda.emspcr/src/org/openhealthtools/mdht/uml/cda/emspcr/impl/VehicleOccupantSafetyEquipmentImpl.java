/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.VehicleOccupantSafetyEquipment;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.VehicleOccupantSafetyEquipmentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle Occupant Safety Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VehicleOccupantSafetyEquipmentImpl extends ObservationImpl implements VehicleOccupantSafetyEquipment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleOccupantSafetyEquipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.VEHICLE_OCCUPANT_SAFETY_EQUIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVehicleOccupantSafetyEquipmentTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VehicleOccupantSafetyEquipmentOperations.validateVehicleOccupantSafetyEquipmentTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVehicleOccupantSafetyEquipmentMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VehicleOccupantSafetyEquipmentOperations.validateVehicleOccupantSafetyEquipmentMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVehicleOccupantSafetyEquipmentCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VehicleOccupantSafetyEquipmentOperations.validateVehicleOccupantSafetyEquipmentCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVehicleOccupantSafetyEquipmentCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VehicleOccupantSafetyEquipmentOperations.validateVehicleOccupantSafetyEquipmentCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVehicleOccupantSafetyEquipmentValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VehicleOccupantSafetyEquipmentOperations.validateVehicleOccupantSafetyEquipmentValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVehicleOccupantSafetyEquipmentValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VehicleOccupantSafetyEquipmentOperations.validateVehicleOccupantSafetyEquipmentValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleOccupantSafetyEquipment init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public VehicleOccupantSafetyEquipment init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // VehicleOccupantSafetyEquipmentImpl

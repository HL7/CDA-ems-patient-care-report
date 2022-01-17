/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.DestinationHospitalCapability;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.DestinationHospitalCapabilityOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Destination Hospital Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DestinationHospitalCapabilityImpl extends ObservationImpl implements DestinationHospitalCapability {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DestinationHospitalCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.DESTINATION_HOSPITAL_CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestinationHospitalCapabilityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DestinationHospitalCapabilityOperations.validateDestinationHospitalCapabilityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestinationHospitalCapabilityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DestinationHospitalCapabilityOperations.validateDestinationHospitalCapabilityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestinationHospitalCapabilityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DestinationHospitalCapabilityOperations.validateDestinationHospitalCapabilityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestinationHospitalCapabilityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DestinationHospitalCapabilityOperations.validateDestinationHospitalCapabilityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestinationHospitalCapabilityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DestinationHospitalCapabilityOperations.validateDestinationHospitalCapabilityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestinationHospitalCapabilityValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DestinationHospitalCapabilityOperations.validateDestinationHospitalCapabilityValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestinationHospitalCapabilityValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DestinationHospitalCapabilityOperations.validateDestinationHospitalCapabilityValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestinationHospitalCapability init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DestinationHospitalCapability init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //DestinationHospitalCapabilityImpl
